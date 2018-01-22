package darko.exercises;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.Sounds;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;
import lejos.hardware.motor.BaseRegulatedMotor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;

public class MotorExercises {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor lever = new EV3LargeRegulatedMotor (MotorPort.A);
		EV3LargeRegulatedMotor right = new EV3LargeRegulatedMotor (MotorPort.C);
		EV3LargeRegulatedMotor left = new EV3LargeRegulatedMotor (MotorPort.B);
		
//		square(lever, right, left);
//		Button.DOWN.waitForPressAndRelease();
		right.setSpeed(700);
		left.rotate(360);
		Delay.msDelay(1000);
		left.stop();
		
	}
	public static void square(EV3LargeRegulatedMotor lever, EV3LargeRegulatedMotor right, EV3LargeRegulatedMotor left) throws InterruptedException
	{
		right.setSpeed(2000);
		left.setSpeed(2000);
		lever.setSpeed(160);
		for (int i = 1; i <= 4; i++)
		{
			right.forward();
			left.forward();
			Delay.msDelay(300);
			right.rotate(360);
			Delay.msDelay(2000);
		}
		right.stop();
		left.stop();
	}
	public static void spin (EV3LargeRegulatedMotor lever, EV3LargeRegulatedMotor right, EV3LargeRegulatedMotor left) throws InterruptedException
	{
		right.setSpeed(2000);
		left.setSpeed(2000);
		right.forward();
		left.forward();
		for (int i = 0; i < 4; i++)
		{
			right.forward();
			left.backward();
		}
		Thread.sleep(2000);
	}
	public static void circle (EV3LargeRegulatedMotor lever, EV3LargeRegulatedMotor right, EV3LargeRegulatedMotor left) throws InterruptedException
	{
		right.setSpeed(2000);
		left.setSpeed(2000);
		right.forward();
		left.forward();
		left.setSpeed(1000);
		for (int i = 0; i < 2; i++)
		{
			right.forward();
			left.forward();
		}
		Thread.sleep(2000);
	}
}
