import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import lejos.nxt.ColorSensor;
import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.comm.BTConnection;
import lejos.nxt.comm.Bluetooth;


public class MarsSlave {

	private static final int READ_ULTRASONIC = 1;
	private static final int READ_COLOR = 2;
	private static final int PROBE_LAKE = 3;
	private static final int LAMP_ON = 4;
	private static final int LAMP_OFF = 5;
	private BTConnection connection;
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	private final Lamp lamp;
	private final CalibratedColorSensor colorSensor;
	private final LakeProbe lakeProbe;
	private final RateLimitedUltrasonicSensor ultrasonicSensor;
	
	public static void main(String[] args) {
		new MarsSlave().run();
	}
	
	public MarsSlave() {
		this.lamp = new Lamp(MotorPort.C);
		this.colorSensor = new CalibratedColorSensor(SensorPort.S1);
		if(!this.colorSensor.isCalibrated()) {
			this.colorSensor.calibrateColors();
		}
		this.lakeProbe = new LakeProbe(MotorPort.A, SensorPort.S3);
		this.ultrasonicSensor = new RateLimitedUltrasonicSensor(SensorPort.S2, 250);
	}

	private void run() {
		System.out.println("Waiting for connection...");
		this.connection = Bluetooth.waitForConnection();
		
		if (this.connection != null)
		{
			this.inputStream = this.connection.openDataInputStream();
			this.outputStream = this.connection.openDataOutputStream();
		}
		else
		{
			throw new RuntimeException("Could not connect to companion");
		}
		
		System.out.println("Connected!");
		
		while(true) {
			try {
				int command = this.inputStream.readInt();
				System.out.println("Command received: " + command);
				switch(command) {
				case READ_ULTRASONIC:
					readUltrasonic();
					break;
				case READ_COLOR:
					readColor();
					break;
				case PROBE_LAKE:
					probeLake();
					break;
				case LAMP_ON:
					lamp.turnOn();
					break;
				case LAMP_OFF:
					lamp.turnOff();
					break;
				default:
					System.out.println("Unkown command received: " + command);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void readColor() throws IOException {
		int colorId = this.colorSensor.getColorID();
		this.outputStream.writeInt(colorId);
		this.outputStream.flush();
	}

	private void probeLake() throws IOException {
		float temp = lakeProbe.probe();
		this.outputStream.writeFloat(temp);
		this.outputStream.flush();
	}

	private void readUltrasonic() throws IOException {
		int distance = this.ultrasonicSensor.getDistance();
		this.outputStream.writeInt(distance);
		this.outputStream.flush();
	}

}
