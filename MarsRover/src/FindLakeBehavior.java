import java.io.IOException;
import java.util.ArrayList;

import lejos.nxt.LCD;
import lejos.robotics.subsumption.Behavior;


public class FindLakeBehavior implements Behavior {
	private static final int BACK_DISTANCE = 100;
	
	private boolean suppressed = false;
	private MarsRover rover;
	private ArrayList<Integer> toProbe = new ArrayList<Integer>();
	private Integer colorID;
	
	public FindLakeBehavior(MarsRover rover) {
		this.rover = rover;
		toProbe.add(2);
		toProbe.add(3);
		toProbe.add(4);
	}
	
	@Override
	public boolean takeControl() {
		try {
			colorID = rover.slave.readColor();
			LCD.drawString("Color: " + colorID, 0, 4);
			return colorID >= 2;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void action() {
		suppressed = false;
		LCD.drawString("Probing lake", 0, 0);
		
		Integer color = this.colorID;
		if(toProbe.contains(color)) {
			try {
				float temp = rover.slave.probeLake();
				LCD.clear(6);
				LCD.drawString("t:" + temp, 0, 6);
				toProbe.remove((Object)color);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		rover.pilot.travelArc(-BACK_DISTANCE, -BACK_DISTANCE, true);
		
		while (rover.pilot.isMoving() && !this.suppressed)
			Thread.yield();
		
		rover.pilot.stop();
	}

	@Override
	public void suppress() {
		suppressed = true;
	}

}
