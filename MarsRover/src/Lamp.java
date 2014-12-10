import lejos.nxt.MotorPort;


public class Lamp
{
	private MotorPort port;
	
	public Lamp(MotorPort port)
	{
		this.port = port;
	}
	
	public void turnOn()
	{
		this.port.controlMotor(100,1);
	}
	
	public void turnOff()
	{
		this.port.controlMotor(0,3);
	}
	
	public void flash(int duration)
	{
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				turnOn();
				try
				{
					Thread.sleep(duration);
				} 
				catch (InterruptedException e)
				{ }
				turnOff();
			}
		}).start();
	}
}
