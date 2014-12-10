import lejos.nxt.LCD;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.subsumption.Behavior;


public class ExplorationBehavior implements Behavior
{
	private boolean suppressed = false;
	private final MarsRover marsRover;
	
	public ExplorationBehavior(MarsRover marsRover)
	{
		this.marsRover = marsRover;
	}

	@Override
	public boolean takeControl()
	{
		return true;
	}

	@Override
	public void action()
	{
		this.suppressed = false;
		LCD.drawString("Exploring....", 0, 0);
		
		marsRover.pilot.forward();
		
		while (!this.suppressed) {
			LCD.clear(1);
			LCD.clear(2);
			LCD.drawString("left: " + marsRover.lightSensorLeft.getLightValue(), 0, 1);
			LCD.drawString("right: " + marsRover.lightSensorRight.getLightValue(), 0, 2);
			Thread.yield();
		}
		
		marsRover.pilot.stop();
		LCD.clear(0);
	}

	@Override
	public void suppress()
	{
		this.suppressed = true;
	}

}
