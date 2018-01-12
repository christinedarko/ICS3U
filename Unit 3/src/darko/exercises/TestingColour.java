package darko.exercises;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.utility.Delay;

public class TestingColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S2);
//		float[] samples = new float[3];
//		colour.getRGBMode().fetchSample(samples, 0);
//		for (int i = 0; i < 3; i++)
//		{
//			System.out.println(samples[i]);
//		}
//		Delay.msDelay(3000);
		
		float[] colourSample = new float[1];
		for (int i= 0; i < 4; i++)
		{
			colour.setFloodlight(Color.WHITE);
			colour.getColorIDMode().fetchSample(colourSample, 0);
			System.out.println(colourSample[0]);
			Delay.msDelay(4000);                                                                   
		}
		
		
	}

}
