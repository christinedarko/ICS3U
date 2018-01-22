package darko.FinalAssignment;

import java.util.ArrayList;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.Color;
import lejos.utility.Delay;
import lejos.hardware.Sound;

public class FinalAssignment {
	
	public static void main (String [] args) {
		EV3UltrasonicSensor ultrasonic = new EV3UltrasonicSensor(SensorPort.S4);
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S2);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		
		ArrayList<String> infoGathered = new ArrayList <String>();
		
		ArrayList<String> clues = new ArrayList <String>();
		clues.add("WOW! It seems like a hat that might of belonged to one of the missing family members. Seems like we're getting somewhere");
		clues.add("I think I've found a hair sample. Reading the DNA...");
		clues.add("Do you hear that noise? I think it's coming from over there!");
		
		ArrayList<String> dangers = new ArrayList <String>();
		dangers.add("OH NO! There's a dragon in our way!");
		dangers.add("AHHH VAMPIRE BATS!");
		dangers.add(""); // decide if you want more than two 
		
		boolean done = false;
		double clueTone = 415.305;
		double dangerTone = 164.814;
		double foundTone = 523.251;
		//Instructions
		for(int i = 0; i < 2; i++) {
			System.out.println("WELCOME AGENT!");
			Button.waitForAnyPress();
			System.out.print("\f");
			
			System.out.println("I AM AGENT leJOS. I WORK FOR THE FBI");
			Button.waitForAnyPress();
			System.out.println("\f");
			
			System.out.println("Our mission today is to find a family who has gone missing.");
			Button.waitForAnyPress();
			System.out.print("\f");
			
			System.out.println("They need our help to get home safely. Come along with me as I search for the missing family");
			Button.waitForAnyPress();
			System.out.print("\f");
			
			System.out.println("Just a couple things before we start. When I've found a clue, this sound will play...");
			Button.waitForAnyPress();
			System.out.print("\f");
			Sound.playTone((int)clueTone, 600);
			
			System.out.println("When there is a danger warning, this sound will play...");
			Button.waitForAnyPress();
			Delay.msDelay(1000);
			System.out.print("\f");
			Sound.playTone((int)dangerTone, 600);
			
			System.out.println(" When I've found the missing family, this sound will play...");
			Button.waitForAnyPress();
			Delay.msDelay(1000);
			System.out.print("\f");
			Sound.playTone((int)foundTone, 600);
			
			System.out.println("If you'd like to continue with the game please wait");
			Button.waitForAnyEvent(15000);
			Delay.msDelay(5000);
			if (Button.readButtons() == 0)
			{
				i = 2;
			}
			else
			{
				i = -1;
			}
		}
		System.out.println("Press the down key to begin the search");
		Button.DOWN.waitForPress();
		
		while (!done == true) {
			move(rightMotor, leftMotor, ultrasonic);
			int clue = clueCheck(colour,rightMotor, leftMotor, clues);
			if (clue != -1) {
				infoGathered.add(clues.remove(clue));
				Delay.msDelay(4000);
			}
			int danger = dangerCheck(colour, rightMotor, leftMotor, dangers);
			if (danger != -1) {
				infoGathered.add(clues.remove(danger));
			}
			done = foundCheck(colour, rightMotor, leftMotor);
			Delay.msDelay(100);
		}
		System.out.println("Thanks for playing!");
		Delay.msDelay(10000);
	}
	public static void rotate (EV3UltrasonicSensor ultrasonic, EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor) {
		rightMotor.setSpeed(700);
		rightMotor.rotate(360);
		Delay.msDelay(1000);
		rightMotor.stop();
	}
	public static boolean clearPath(EV3UltrasonicSensor ultrasonic, EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor) {
		boolean clearPath = false;
		float[] distances = new float[1];
		boolean done = false;
		while(!done)
		{
			ultrasonic.getDistanceMode().fetchSample(distances, 0);
			if (distances[0] >= 0.1){
				clearPath = true;
				done = true;
			}
			else {
				rotate(ultrasonic, rightMotor, leftMotor);
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
		boolean clearPath = clearPath(ultrasonic, rightMotor, leftMotor); 
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
	
	public static int clueCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor, ArrayList <String> clues)  {
		float[] colourSample = new float[1];
		int random = -1;
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == Color.YELLOW) {
			rightMotor.stop();
			leftMotor.stop();
			System.out.println("YAY! You found a clue!");
			Delay.msDelay(7000);
			//Print out clue message
			random = (int) (Math.random() * clues.size());
		}
		return random;
	}
	
	public static int dangerCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor, ArrayList <String> dangers) {
		float[] colourSample = new float[1];
		int random = -1;
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == Color.RED) {
			rightMotor.stop();
			leftMotor.stop();
			System.out.println("OH NO! Stranger Danger!");
			Delay.msDelay(7000);
			//Prints out danger message
			random = (int) (Math.random() * dangers.size());
		}
		return random;
	}
	public static boolean foundCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor) {
		boolean found = false;
		float[] colourSample = new float[1];
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == Color.GREEN) {
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
