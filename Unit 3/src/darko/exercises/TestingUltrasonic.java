package darko.exercises;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Delay;

public class TestingUltrasonic {
	
	public static void main(String args[])
	{
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		
		float[] distances = new float[1];
		for (int i = 0; i < 4; i++)
		{
			sonar.fetchSample(distances, 0);
			System.out.println(distances[0]);
			Delay.msDelay(800);
		}
		
	}

}
