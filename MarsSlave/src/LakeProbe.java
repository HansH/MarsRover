import lejos.nxt.BasicMotor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.addon.RCXMotor;
import lejos.nxt.addon.RCXTemperatureSensor;
import lejos.util.Delay;


public class LakeProbe 
{
	private static final int MOTOR_OPERATION_SPEED = 100;
	private static final int MOTOR_OPERATION_TIME = 2000;
	private static final int SENSOR_READING_DELAY = 500;
	
	private final BasicMotor motor;
	private final RCXTemperatureSensor sensor;
	
	public LakeProbe(MotorPort motorPort, SensorPort sensorPort)
	{
		this.motor = new RCXMotor(motorPort);
		this.sensor = new RCXTemperatureSensor(sensorPort);
	}
	
	public float probe()
	{
		this.lower();
		Delay.msDelay(SENSOR_READING_DELAY);
		float reading = sensor.getCelcius();
		this.raise();
		
		return reading;
	}

	public void lower() 
	{
		this.motor.setPower(-MOTOR_OPERATION_SPEED);
		Delay.msDelay(MOTOR_OPERATION_TIME);
		this.motor.setPower(0);
	}
	
	public void raise()
	{
		this.motor.setPower(MOTOR_OPERATION_SPEED);
		Delay.msDelay(MOTOR_OPERATION_TIME);
		this.motor.setPower(0);
	}
}
