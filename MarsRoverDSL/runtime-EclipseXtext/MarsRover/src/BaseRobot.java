import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.remote.RemoteNXT;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.localization.OdometryPoseProvider;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;


public abstract class BaseRobot {
	private static final String SLAVE_NAME = "NXT2";
	// Physical properties of the Rover
		public static final double WHEEL_DIAMETER = 56; // mm
		public static final double TRACK_WIDTH = 110; // mm
		// Constants
		public static final int ULTRASONIC_RATE = 10;
		public static final double TRAVEL_SPEED = 100; // 100 mm/s
		public static final double ROTATE_SPEED = 100; // 100 degrees/second
		
		public DifferentialPilot pilot;
		
		public Lamp lamp;
		public CalibratedLightSensor lightSensorLeft;
		public CalibratedLightSensor lightSensorRight;
		public TouchSensor touchSensorLeft;
		public TouchSensor touchSensorRight;
		public UltrasonicSensor ultrasonicSensor;
		
		public RemoteMarsSlave slave;
		
		ArrayList<Integer> toProbe;
		LinkedMap<Integer, Float> probed;
		
		public BaseRobot() {
			this.toProbe = new ArrayList<Integer>();
			this.toProbe.add(2);
			this.toProbe.add(3);
			this.toProbe.add(4);
			
			this.probed = new LinkedMap<Integer, Float>();	
		}

		protected void run() {
			this.prepareRobot();
			Button.waitForAnyPress();
			
			new Thread(new Runnable() {
				@Override
				public void run() {
					OdometryPoseProvider provider = new OdometryPoseProvider(pilot);
					while (true) {
						System.out.println(provider.getPose().getHeading());
						Delay.msDelay(100);
					}
				}
			}).start();
			
			new Arbitrator(getBehaviors()).start();
		}

		protected abstract Behavior[] getBehaviors();

		private void prepareRobot()
		{
			RegulatedMotor leftMotor = Motor.A;
			RegulatedMotor rightMotor = Motor.B;
			
			this.lightSensorLeft = new CalibratedLightSensor(SensorPort.S1);
			this.lightSensorRight = new CalibratedLightSensor(SensorPort.S2);
			this.touchSensorLeft = new TouchSensor(SensorPort.S3);
			this.touchSensorRight = new TouchSensor(SensorPort.S4);
			
			this.pilot = new DifferentialPilot(WHEEL_DIAMETER, TRACK_WIDTH, leftMotor, rightMotor);
			this.pilot.setRotateSpeed(ROTATE_SPEED);
			this.pilot.setTravelSpeed(TRAVEL_SPEED);
			
			System.out.println("Connecting to slave...");
			
			try {
				RemoteNXT remote = new RemoteNXT(SLAVE_NAME, Bluetooth.getConnector());
				remote.startProgram("MarsSlave.nxj");
				remote.close();
			} catch (IOException ex)
			{ }
			
			this.slave = new RemoteMarsSlave();
			this.slave.connect(SLAVE_NAME);
			System.out.println("Connected!");
			
			if (!this.lightSensorLeft.isCalibrated() || !this.lightSensorRight.isCalibrated()) {
				this.calibrateLightSensors();
			}
		}

		private void calibrateLightSensors() {
			LCD.clear();
			
			LCD.drawString("Place both", 0, 0);
			LCD.drawString("lightsensors", 0, 1);
			LCD.drawString("on black", 0, 2);
			Button.waitForAnyPress();
			lightSensorLeft.calibrateLow();
			lightSensorRight.calibrateLow();
			
			LCD.drawString("white", 3, 2);
			Button.waitForAnyPress();
			lightSensorLeft.calibrateHigh();
			lightSensorRight.calibrateHigh();
			LCD.clear();
			
			lightSensorLeft.storeCalibrationData();
			lightSensorRight.storeCalibrationData();
		}
}
