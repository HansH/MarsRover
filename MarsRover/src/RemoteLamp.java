import lejos.robotics.DCMotor;




public class RemoteLamp extends Lamp {
	private DCMotor motor;
	
	
	public RemoteLamp(DCMotor motor) {
		super(null);
		this.motor = motor;
	}
	
	@Override
	public void turnOn() {
		motor.forward();
		motor.setPower(100);
	}
	
	@Override
	public void turnOff() {
		motor.stop();
		motor.setPower(0);
	}

}
