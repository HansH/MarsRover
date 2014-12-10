import lejos.nxt.LCD;
import lejos.nxt.Sound;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.subsumption.Behavior;


public class CollisionBehavior implements Behavior
{
	private static final int BACK_DISTANCE = 100;
	
	private boolean suppressed = false;
	
	private final TouchSensor touchSensor;
	private final MarsRover marsRover;
	private final boolean rotateLeft;
	
	public CollisionBehavior(MarsRover marsRover, TouchSensor touchSensor, boolean rotateLeft)
	{
		this.marsRover = marsRover;
		this.touchSensor = touchSensor;
		this.rotateLeft = rotateLeft;
	}
	
	@Override
	public boolean takeControl()
	{
		return this.touchSensor.isPressed();
	}
	
	@Override
	public void suppress()
	{
		this.suppressed = true;
	}

	@Override
	public void action()
	{
		this.suppressed = false;
		LCD.drawString("Collision", 0, 0);
		
		marsRover.pilot.travelArc(rotateLeft ? -BACK_DISTANCE : BACK_DISTANCE, -BACK_DISTANCE, true);
		
		while (marsRover.pilot.isMoving() && !this.suppressed)
			Thread.yield();
		
		marsRover.pilot.stop();
		LCD.clear(0);
	}
	
	private void playSound()
	{
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				Sound.systemSound(false, 4);
			}
		}).start();
	}
}
