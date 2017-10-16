package darko;
/**
 * Program Name: Happy and you know it
 * Description: This Program displays 10 verses of the happy and you know it song.
 * @author Christine Darko
 */
import java.util.Scanner;

public class ArrayPracticeTwoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to play a game?");
		String answer = sc.nextLine();
		System.out.println("Okay let's play!!!!!!");
		Thread.sleep(500);
		
		String [] verse = {"clap your hands", "stomp your feet", "say hooray", "cross your arms", "snap your fingers", "touch your toes", "raise the roof", "kiss your teeth", "tap your neighbour", "leave the room", };
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("If your happy and you know it " + verse [i]);
			System.out.println("If your happy and you know it " + verse [i]);
			System.out.println("If your happy and you know it and you really want to show it.");
			System.out.println("If your happy and you know it " + verse [i]);
			Thread.sleep(500);
			System.out.println("");
		}
	}

}
