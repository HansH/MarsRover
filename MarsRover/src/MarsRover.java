import java.io.IOException;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Ticker;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.remote.RemoteNXT;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.localization.OdometryPoseProvider;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;


public class MarsRover {
	// Physical properties of the Rover
	public static final double WHEEL_DIAMETER = 56; // mm
	public static final double TRACK_WIDTH = 110; // mm
	// Constants
	private static final int ULTRASONIC_RATE = 10;
	private static final double TRAVEL_SPEED = 100; // 100 mm/s
	private static final double ROTATE_SPEED = 100; // 100 degrees/second
	
	DifferentialPilot pilot;
	
	Lamp lamp;
	LightSensor lightSensorLeft;
	LightSensor lightSensorRight;
	TouchSensor touchSensorLeft;
	TouchSensor touchSensorRight;
	UltrasonicSensor ultrasonicSensor;
	
	RemoteMarsSlave slave;
	
	public static void main(String[] args) {
		new MarsRover().run();
	}

	private void run() {
		this.prepareRobot();
		
//		Thread policeThread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					Lamp lamp1 = new Lamp(MotorPort.C);
//					
//					while (true)
//					{
//						lamp1.turnOn();
//						slave.lampOff();
//						
//						//Sound.playTone(440, 500);
//						try {
//							Thread.sleep(500);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						
//						lamp1.turnOff();
//						slave.lampOn();
//						
//						//Sound.playTone(660, 500);
//						try {
//							Thread.sleep(500);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		policeThread.setDaemon(true);
		//policeThread.start();
		
		
		Button.waitForAnyPress();
		
		Behavior[] behaviors = {
				new ExplorationBehavior(this),
				new FindLakeBehavior(this),
				new CollisionBehavior(this, touchSensorLeft, false),
				new CollisionBehavior(this, touchSensorRight, true),
				new EnvironmentBoundsBehavior(this, lightSensorLeft, false),
				new EnvironmentBoundsBehavior(this, lightSensorRight, true)
		};
		new Arbitrator(behaviors).start();
	}

	private void prepareRobot()
	{
		RegulatedMotor leftMotor = Motor.A;
		RegulatedMotor rightMotor = Motor.B;
		
		this.lightSensorLeft = new LightSensor(SensorPort.S1);
		this.lightSensorRight = new LightSensor(SensorPort.S2);
		this.touchSensorLeft = new TouchSensor(SensorPort.S3);
		this.touchSensorRight = new TouchSensor(SensorPort.S4);
		
		this.pilot = new DifferentialPilot(WHEEL_DIAMETER, TRACK_WIDTH, leftMotor, rightMotor);
		this.pilot.setRotateSpeed(ROTATE_SPEED);
		this.pilot.setTravelSpeed(TRAVEL_SPEED);
		
		try {
			RemoteNXT remote = new RemoteNXT("Rover2", Bluetooth.getConnector());
			remote.startProgram("MarsSlave.nxj");
			remote.close();
		} catch (IOException ex)
		{ }
		
		this.slave = new RemoteMarsSlave();
		this.slave.connect("Rover2");
		
		calibrateLightSensors();
	}

	private void calibrateLightSensors() {
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
	}
}
