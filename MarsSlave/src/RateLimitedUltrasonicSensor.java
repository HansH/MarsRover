import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;


public class RateLimitedUltrasonicSensor extends UltrasonicSensor
{
	private final int minDelay;
	
	private int lastValue;
	private long lastMeasurement = 0;
	
	public RateLimitedUltrasonicSensor(SensorPort port, int minDelay)
	{
		super(port);
		this.minDelay = minDelay;
	}
	
	@Override
	public int getDistance()
	{
		if (System.currentTimeMillis() > lastMeasurement + minDelay)
			lastValue = super.getDistance();
		return lastValue;
	}
}
