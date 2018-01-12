package darko.exercises;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.utility.Delay;

public class TestingGyroSensor {
	
	public static void main (String [] args) {
		EV3GyroSensor gyro = new EV3GyroSensor(SensorPort.S1);
		float[] samples = new float[1];
		for (int i = 0; i < 3; i++)
		{
			gyro.getAngleMode().fetchSample(samples, 0);
			System.out.println(samples[0]);
			Delay.msDelay(5000);
		}
	}

}
 

