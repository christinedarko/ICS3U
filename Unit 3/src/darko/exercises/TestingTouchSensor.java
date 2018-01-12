package darko.exercises;

import lejos.hardware.Button;
import lejos.hardware.port.MotorPort;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;

public class TestingTouchSensor {

	public static void main(String[] args) {
		
		EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S3);
		EV3LargeRegulatedMotor right = new EV3LargeRegulatedMotor (MotorPort.B);
		EV3LargeRegulatedMotor left = new EV3LargeRegulatedMotor (MotorPort.C);
		
		float [] samples = new float[1];
		right.setSpeed(2000);
		left.setSpeed(2000);
		
		for (int i = 0; i < 4; i++)
		{
		right.forward();
		left.forward();
		touch.fetchSample(samples, 0);
		boolean pressed = isTouched(touch,samples);
		if (pressed == true) {
			Delay.msDelay(1000);
			right.stop();
			left.stop();
			
		}
		System.out.println(samples[0]);
		Delay.msDelay(1000);
		}
	
	}
	public static boolean isTouched(EV3TouchSensor touch, float [] samples) {
		boolean pressed = false;
		for (int i = 0; i < 4; i++)
		{
			touch.fetchSample(samples, 0);
			System.out.println(samples[0]);
			Delay.msDelay(1000);
			if (samples[0] == 1.0) {
				pressed = true; 
			}
		}
		return pressed;
	}
}
