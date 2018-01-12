package darko.exercises;



import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.Sounds;
import lejos.hardware.motor.Motor;

public class HelloWorld {
	
	public static void main (String [] args) throws InterruptedException {
		Sound.playTone((int)783.99, 800);
		Sound.playTone((int)698.46, 700);
		Sound.playTone((int)659.25, 700);
		Sound.playTone((int)587.33, 700);
		Sound.playTone((int)523.25, 700);
		Sound.playTone((int)587.33, 700);
		Sound.playTone((int)659.25, 700);
		Sound.playTone((int)523.25, 1000);
		
		Sound.playTone((int)597.33, 400);
		Sound.playTone((int)659.25, 400);
		Sound.playTone((int)698.46, 400);
		Sound.playTone((int)597.33, 400);
		Sound.playTone((int)659.25, 500);
		Sound.pause(300);
		Sound.playTone((int)597.33, 400);
		Sound.playTone((int)523.25, 400);
		Sound.playTone((int)493.88, 400);
		Sound.playTone((int)523.25, 500);
		
	
	}
}
