package darko.FinalAssignment;
/**
 * Final Assignment
 * January 23, 2017
 * @author Christine Darko
 * This program is a game that executes to a leJOS EV3 Mindstorms robot. The robot is an FBI agent searching for a missing family.
 * There are a series of methods that complete different jobs to help Agent leJOS find the missing family. 
 */
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

		ArrayList<String> clues = new ArrayList <String>(3);
		clues.add("WOW! It seems like a hat that might of belonged to one of the missing family members. Seems like we're getting somewhere");
		clues.add("I think I've found a hair sample. Reading the DNA...");
		clues.add("Do you hear that noise? I think it's coming from over there!");

		ArrayList<String> dangers = new ArrayList <String>();
		dangers.add("OH NO! There's a dragon in our way!");
		dangers.add("AHHH VAMPIRE BATS!");

		boolean done = false;
		double clueTone = 415.305;
		double dangerTone = 164.814;
		double foundTone = 523.251;

		ultrasonic.enable();
		
		//Instructions
		System.out.println("WELCOME AGENT!");
		Button.waitForAnyPress();
		System.out.println("\f");

		System.out.println("I AM AGENT leJOS. I WORK FOR THE FBI");
		Button.waitForAnyPress();
		System.out.println("\f");

		System.out.println("Our mission today is to find a family who has gone missing.");
		Button.waitForAnyPress();
		System.out.println("\f");

		System.out.println("They need our help to get home safely. Come along with me as I search for the missing family");
		Button.waitForAnyPress();
		System.out.println("\f");

		System.out.println("Just a couple things before we start. When I've found a clue, this sound will play...");
		Button.waitForAnyPress();
		Delay.msDelay(1000);
		System.out.println("\f");
		Sound.playTone((int)clueTone, 600);

		System.out.println("When there is a danger warning, this sound will play...");
		Button.waitForAnyPress();
		Delay.msDelay(1000);
		System.out.println("\f");
		Sound.playTone((int)dangerTone, 600);

		System.out.println(" When I've found the missing family, this sound will play...");
		Button.waitForAnyPress();
		Delay.msDelay(1000);
		System.out.println("\f");
		Sound.playTone((int)foundTone, 600);

		System.out.println("Please wait for the game to begin");
		Button.waitForAnyEvent(15000);
		Delay.msDelay(5000);

		System.out.println("Press the down key to begin the search");
		Button.DOWN.waitForPress();
		System.out.println("\f");

		while (!done == true) {
			move(rightMotor, leftMotor, ultrasonic);
			int clue = clueCheck(colour,rightMotor, leftMotor, clues);
			if (clue != -1) {
				Sound.playTone((int)clueTone, 600);
				System.out.println(clues.get(clue));
				infoGathered.add(clues.remove(clue));
				Delay.msDelay(2000);
			}
			int danger = dangerCheck(colour, rightMotor, leftMotor, dangers);
			if (danger != -1) {
				Sound.playTone((int)dangerTone, 600);
				System.out.println(dangers.get(danger));
				infoGathered.add(dangers.remove(danger));
			}
			done = foundCheck(colour, rightMotor, leftMotor);
			if (done == true) {
				Sound.playTone((int)foundTone, 600);
			}
			Delay.msDelay(100);
		}
		System.out.println("\f");
		System.out.println("Thanks for playing!");
		Delay.msDelay(10000);
	}
	/**
	 * This method rotates the robot whenever it hits a blockade
	 * @param ultrasonic 
	 * 					The sensor that checks for a clear path ahead
	 * @param rightMotor 
	 * 					The right wheel of the robot
	 * @param leftMotor 
	 * 					The left wheel of the robot
	 */
	public static void rotate ( EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor) {
		leftMotor.setSpeed(300);
		rightMotor.setSpeed(300);
		rightMotor.rotate(-90);
		leftMotor.rotate(90);
		Delay.msDelay(1000); 
		rightMotor.stop();
		leftMotor.stop();
	}
	/**
	 * This method checks for a clear path a certain distance away from the robot
	 * @param ultrasonic
						The sensor that checks for a clear path ahead
	 * @param rightMotor 
	 * 					The right wheel of the robot
	 * @param leftMotor 
	 * 					The left wheel of the robot
	 * @return
	 * 			boolean clearPath  - true for clear, false for not clear
	 */
	public static boolean clearPath(EV3UltrasonicSensor ultrasonic, EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor) {
		boolean clearPath = false;
		float[] distances = new float[1];
		ultrasonic .fetchSample(distances, 0);
		while(distances[0] <= 0.13)
		{
			clearPath = true;
			rotate(rightMotor, leftMotor);
			ultrasonic.getDistanceMode().fetchSample(distances, 0);
		}
		return clearPath;
	}
	/**
	 * This method controls the movement of the robot throughout the search
	 * @param rightMotor
	 * 					right wheel of the robot
	 * @param leftMotor
	 * 					left wheel of the robot
	 * @param ultrasonic
	 * 					The sensor that checks for a clear pathway
	 */
	public static void move(EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor,EV3UltrasonicSensor ultrasonic) {
		boolean clearPath = clearPath(ultrasonic, rightMotor, leftMotor); 
		rightMotor.setSpeed(300);
		leftMotor.setSpeed(300);
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
	/**
	 * This method check for clues that will help lead the robot to the missing family
	 * @param colour
	 * 				The sensor that checks for the colour reading
	 * @param rightMotor
	 * 					The motor that controls the right wheel
	 * @param leftMotor
	 * 					The motor that controls the left wheel
	 * @param clues
	 * 				The array of messages that will output when a clue is found
	 * @return
	 * 			int random - a random number to choose which clue message will be outputted
	 */

	public static int clueCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor, ArrayList <String> clues)  {
		float[] colourSample = new float[1];
		int random = -1;
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == Color.YELLOW) {
			rightMotor.stop();
			leftMotor.stop();
			System.out.println("YAY! You found a clue!");
			Delay.msDelay(2000);
			random = (int) (Math.random() * clues.size());
		}
		return random;
	}

	/**
	 * This method check for danger warnings that may hinder the robot from finding the missing family
	 * @param colour
	 * 				The sensor that checks for the colour reading
	 * @param rightMotor
	 * 					The motor that controls the right wheel
	 * @param leftMotor
	 * 					The motor that controls the left wheel
	 * @param dangers
	 * 				The array of messages that will output when a danger warning is found is found
	 * @return
	 * 			int random - a random number to choose which danger message will be outputted
	 */
	public static int dangerCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor, ArrayList <String> dangers) {
		float[] colourSample = new float[1];
		int random = -1;
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == Color.RED) {
			rightMotor.stop();
			leftMotor.stop();
			Delay.msDelay(7000);
			random = (int) (Math.random() * dangers.size());
		}
		return random;
	}
	
	/**
	 * This method checks if the missing family has been found
	 * @param colour
	 * 				The sensor that checks for the colour reading
	 * @param rightMotor
	 * 					The motor that controls the right wheel
	 * @param leftMotor
	 * 					The motor that controls the left wheel
	 * @return
	 * 			boolean found - returns true if family has been found
	 */
	public static boolean foundCheck (EV3ColorSensor colour, EV3LargeRegulatedMotor rightMotor,EV3LargeRegulatedMotor leftMotor) {
		boolean found = false;
		float[] colourSample = new float[1];
		colour.getColorIDMode().fetchSample(colourSample, 0);
		if (colourSample[0] == Color.GREEN) {

			System.out.println("YAY! You found the missing family!");
			found = true;
			rightMotor.stop();
			leftMotor.stop();
		}
		else {
			found = false;
		}	
		return found;
	}

}
