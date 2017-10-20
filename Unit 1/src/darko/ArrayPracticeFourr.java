package darko;

import java.util.Scanner;
/**
 * Program Name: ArrayProblemFourr
 * Description: This program plays a guessing game with the user.
 * @author 324714468
 *
 */
public class ArrayPracticeFourr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi let's play a game about gymnastics skills. Think of a floor skill and press the enter key when you are ready.");
		sc.nextLine();
		String [] skills = {"cartwheel", "handstand", "back handspring (back flip)", "split", "bridge", "candlestick", "aerial", "half turn", "front walkover", "back walkover", "front handspring (front flip)", "front handspring stepout", "press handstand", "back handspring stepout", "front aerial", "dive rolls", "back tuck", "front limber", "somersault (roll)", "round off", "straddle jump" };
		int choice;
		String response;
		for (int i = 0; i < 20; i++)
		{
			choice = (int)(Math.random()*20);
			System.out.println("Is it a " + skills [choice]);
			response = sc.nextLine();
			if (response.equalsIgnoreCase("yes"))
			{
				System.out.println("Yay! I won");
				i = 20;
			}
			else if (response.equalsIgnoreCase("no"))
			{
				
			}
		}
	}

}
