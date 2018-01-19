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
		boolean done = false;
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
		System.out.println("Press the down key to begin the search");
		Button.DOWN.waitForPress();
		
		while (!done == true) {
			move(rightMotor, leftMotor, ultrasonic);
			clueCheck(colour,rightMotor, leftMotor);
			dangerCheck(colour, rightMotor, leftMotor);
			done = foundCheck(colour, rightMotor, leftMotor);
			Delay.msDelay(100);
		}
	}
	public static void rotate (EV3UltrasonicSensor ultrasonic) {
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		rightMotor.setSpeed(700);
		rightMotor.rotate(360);
		Delay.msDelay(1000);
		rightMotor.stop();
	}
	public static boolean clearPath(EV3UltrasonicSensor ultrasonic) {
		boolean clearPath = false;
		float[] distances = new float[1];
		for (int i = 0; i < 4; i++)
		{
			ultrasonic.fetchSample(distances, 0);
			if (distances[0] >= 0.025){
				clearPath = true;
				i = 4;
			}
			else {
				rotate(ultrasonic);
				i=-1;
			}
			Delay.msDelay(300);
		}
		return clearPath;
	}
	
	public static void move(EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor,EV3UltrasonicSensor ultrasonic) {
		rightMotor.setSpeed(360);
		leftMotor.setSpeed(360);
		rightMotor.forward();
		leftMotor.forward();
		boolean clearPath = clearPath(ultrasonic); 
		if (clearPath == true)
		{
			Delay.msDelay(800);
		}
		else 
		{
			rightMotor.forward();
			leftMotor.forward();
		}
	}
	
	public static void clueCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor) {
		float[] colourSample = new float[1];
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == 3) {
			rightMotor.stop();
			leftMotor.stop();
			System.out.println("YAY! You found a clue!");
			//Print out clue instruction
			Delay.msDelay(7000);
		}
		else {
			
		}	
	}
	
	public static void dangerCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor) {
		float[] colourSample = new float[1];
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == 0) {
			rightMotor.stop();
			leftMotor.stop();
			System.out.println("OH NO! Stranger Danger!");
			//Print out danger instruction
			Delay.msDelay(7000);
		}
		else {
			
		}	
	}
	public static boolean foundCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor) {
		boolean found = false;
		float[] colourSample = new float[1];
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == 1) {
			rightMotor.stop();
			leftMotor.stop();
			System.out.println("YAY! You found the missing persons!");
			//Print out found missing persons instructions
			found = true;
		}
		else {
			found = false;
		}	
		return found;
	}

}
