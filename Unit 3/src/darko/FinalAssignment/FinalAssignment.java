package darko.FinalAssignment;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Delay;

public class FinalAssignment {
	
	public static void main (String [] args) {
		EV3UltrasonicSensor ultrasonic = new EV3UltrasonicSensor(SensorPort.S4);
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S2);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		
		//Insert instructions here
		System.out.println("Press the DOWN button to repeat the instructions");
		boolean repeat = false;
		Button.waitForAnyEvent(5000);
		if (Button.readButtons() == 0)
		{
			//exit loop
		}
		else
		{
			//repeat loop
		}
	}
	public static boolean clearPath(EV3UltrasonicSensor ultrasonic) {
		boolean clearPath = false;
		float[] distances = new float[1];
		for (int i = 0; i < 4; i++)
		{
			ultrasonic.fetchSample(distances, 0);
			if (distances[0] >= 2.5){
				clearPath = true;
			}
			else {
				ri
			}
			Delay.msDelay(300);
		}
	}
	
	public static void move(EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor,EV3UltrasonicSensor ultrasonic) {
		rightMotor.setSpeed(360);
		leftMotor.setSpeed(360);
		rightMotor.forward();
		leftMotor.forward();
		boolean clearPath = false; // fix to clearPath method
		if (clearPath == true)
		{
			 // tell motors to stop inside clearPath
			
			Delay.msDelay(1000);
		}
		else 
		{
			rightMotor.forward();
			leftMotor.forward();
		}
		
		
	}

}
