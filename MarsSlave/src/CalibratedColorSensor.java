import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import lejos.nxt.Button;
import lejos.nxt.ColorSensor;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;


public class CalibratedColorSensor extends ColorSensor
{
	public static final int BLACK = 0;
	public static final int WHITE = 1;
	
	private ArrayList<Color> colorsToDetect;
	
	public CalibratedColorSensor(SensorPort port)
	{
		super(port);
		this.colorsToDetect = new ArrayList<Color>();
		
		this.attemptLoadingCalibrationData();
	}
	
	private void attemptLoadingCalibrationData()
	{
		try
		{
			File calibrationFile = new File("calibration_data");
			if (calibrationFile.exists())
			{
				DataInputStream input = new DataInputStream(
						new FileInputStream(calibrationFile));
				
				int available = input.readInt();
				while (available-- > 0)
				{
					this.colorsToDetect.add(new Color(
							input.readInt(), //r
							input.readInt(), //g
							input.readInt(), //b
							input.readInt(), //background
							input.readInt())); //colorId		
				}
				
				input.close();
			}
		}
		catch (IOException ex)
		{
			// Oh well
		}
	}
	
	private void storeCalibrationData()
	{
		try
		{
			File file = new File("calibration_data");
			file.createNewFile();
			DataOutputStream output = new DataOutputStream(
					new FileOutputStream(file));
			
			output.writeInt(colorsToDetect.size());
			for (Color color : colorsToDetect)
			{
				output.writeInt(color.getRed());
				output.writeInt(color.getGreen());
				output.writeInt(color.getBlue());
				output.writeInt(color.getBackground());
				output.writeInt(color.getColor());
			}
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
		return !this.colorsToDetect.isEmpty();
	}
	
	public void calibrateColors()
	{
		LCD.drawString("Place on black", 0, 0);
		LCD.drawString("press any button", 0, 1);
		Button.waitForAnyPress();
		colorsToDetect.add(this.getRawColor());
		
		LCD.drawString("Place on white", 0, 0);
		Button.waitForAnyPress();
		colorsToDetect.add(this.getRawColor());
		
		LCD.clear();
		LCD.drawString("Place on next color", 0, 0);
		LCD.drawString("OK to continue", 0, 1);
		LCD.drawString("ESC when finished", 0, 2);
		LCD.drawString("Count: " + colorsToDetect.size(), 0, 3);
		
		while(true)
		{
			int button = Button.waitForAnyPress();
			if (button == Button.ID_ENTER)
			{
				colorsToDetect.add(this.getRawColor());
				LCD.drawString("Count: " + colorsToDetect.size(), 0, 3);
			}
			else if (button == Button.ID_ESCAPE)
			{
				break;
			}
		}
		
		this.storeCalibrationData();
		LCD.clear();
	}

	@Override
	public int getColorID() 
	{
		if (!this.isCalibrated())
		{
			throw new IllegalStateException("Sensor not calibrated");
		}
		
		Color detected = this.getRawColor();
		
		int bestIndex = 0;
		int bestDistance = Integer.MAX_VALUE;
		
		for(int i = 0; i < colorsToDetect.size(); i++) 
		{
			Color toDetect = colorsToDetect.get(i);
			int distance = distance(detected, toDetect);
			if (distance < bestDistance) 
			{
				bestIndex = i;
				bestDistance = distance;
			}
		}
		
		return bestIndex;
	}
	
	@Override
	public int getLightValue()
	{
		int detected = this.getColorID();
		if (detected == WHITE)
			return 255;
		else if (detected == BLACK)
			return 0;
		else
			return 128;
	}
	
	public int getCalibratedColorCount() 
	{
		return this.colorsToDetect.size();
	}
	
	private static int distance(Color a, Color b) 
	{
		return (a.getRed() - b.getRed()) * (a.getRed() - b.getRed())
				+ (a.getGreen() - b.getGreen()) * (a.getGreen() - b.getGreen())
				+ (a.getBlue() - b.getBlue()) * (a.getBlue() - b.getBlue());
	}
}
