import lejos.nxt.LightSensor;
import lejos.robotics.subsumption.Behavior;


public class EnvironmentBoundsBehavior implements Behavior {

	private static final int TRESHOLD = 80;
	MarsRover marsRover;
	LightSensor lightSensor;
	boolean rotateLeft;
	boolean suppressed = false;
	
	
	public EnvironmentBoundsBehavior(MarsRover marsRover,
			LightSensor lightSensor, boolean rotateLeft) {
		this.marsRover = marsRover;
		this.lightSensor = lightSensor;
		this.rotateLeft = rotateLeft;
	}

	@Override
	public boolean takeControl() {
		return lightSensor.getLightValue() > TRESHOLD;
	}

	@Override
	public void action() {
		this.suppressed = false;
		
//		marsRover.pilot.travel(-100, true);
//		
//		while(!this.suppressed && marsRover.pilot.isMoving()) {
//			Thread.yield();
//		}
		
		if(rotateLeft) {
			marsRover.pilot.arcBackward(-100);
		}
		else {
			marsRover.pilot.arcBackward(100);
		}
		
		while(!this.suppressed && lightSensor.getLightValue() > TRESHOLD) {
			Thread.yield();
		}
		
		if(rotateLeft) {
			marsRover.pilot.travelArc(-100, -20, true);
		}
		else {
			marsRover.pilot.travelArc(100, -20, true);
		}
		
		while(!this.suppressed && marsRover.pilot.isMoving()) {
			Thread.yield();
		}
		
		marsRover.pilot.stop();
	}

	@Override
	public void suppress() {
		this.suppressed = true;
	}

}
