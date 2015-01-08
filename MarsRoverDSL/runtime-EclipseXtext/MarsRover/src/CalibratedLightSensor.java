import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import lejos.nxt.ADSensorPort;
import lejos.nxt.LightSensor;


public class CalibratedLightSensor extends LightSensor {

	private boolean isCalibrated;
	
	public CalibratedLightSensor(ADSensorPort port) {
		super(port);
		
		this.isCalibrated = false;
		this.attemptLoadingCalibrationData();
	}
	
	private void attemptLoadingCalibrationData()
	{
		try
		{
			File calibrationFile = new File("light_calibration_data");
			if (calibrationFile.exists())
			{
				DataInputStream input = new DataInputStream(
						new FileInputStream(calibrationFile));
				
				this.setLow(input.readInt());
				this.setHigh(input.readInt());
				
				this.isCalibrated = true;
				input.close();
			}
		}
		catch (IOException ex)
		{
			// Oh well
		}
	}
	
	public void storeCalibrationData()
	{
		try
		{
			File file = new File("light_calibration_data");
			file.createNewFile();
			DataOutputStream output = new DataOutputStream(
					new FileOutputStream(file));
			
			output.writeInt(this.getLow());
			output.writeInt(this.getHigh());
			
			output.flush();
			output.close();
		}
		catch (IOException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public boolean isCalibrated()
	{
		return this.isCalibrated;
	}
	
}
