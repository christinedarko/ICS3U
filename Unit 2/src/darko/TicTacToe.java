/**
 * 
 */
package darko;

/**
 * Program Name: Tic Tac Toe
 * Date: November 16, 2017
 * Description: This program creates a user friendly tic tac toe game.
 * @author Christine Darko
 *
 */
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO TIC TAC TOE");
		Thread.sleep(1000);
		System.out.println("\n");
		System.out.print("This game requires two players. Press 1 if you have someone to play with or press 2 to play with the computer.");
		//Fix working with the computer
		char player1 = 'X';
		char player2 = 'o';
		char [][] ticTacToe = new char[3][3];
		System.out.println("Since we are playing this game through java, we are going to play this differently.");
		Thread.sleep(2000);
		System.out.println("You will be playing on a 3x3 grid.");
		Thread.sleep(2000);
		System.out.println("To choose where you will place your character, you will have to use coordinates.");
		Thread.sleep(2500);
		System.out.println("The first number being the row and the second the column you'd like to place your character in.");
		Thread.sleep(2500);
		System.out.println("Rows are numbered from left to right from 1 to 3.");
		Thread.sleep(2000);
		System.out.println("Columns are numbered from top to bottom from 1 to 3");
		Thread.sleep(2000);
		System.out.println("Press enter to begin");
		String space = sc.nextLine();
		for (int i = 0; i < 9; i++)
		{
			System.out.println("Player 1 choose a spot");
			ticTacToe [sc.nextInt() - 1][sc.nextInt() - 1] =  player1;
			System.out.println("Player 2 choose a spot");
			ticTacToe [sc.nextInt() - 1][sc.nextInt() - 1] =  player2;
			
		}
	}
	
	public static boolean checkPlayer1 (char [][] toe )
	{
		int counter1 = 1;
		int counter2 = 1;
		int counter3 = 1;
		int counter4 = 1;
		char player1 = 'X';
		boolean win = false;
		//for rows
		for (int i = 0; i < toe.length; i++)
		{
			counter1 = 1;
			for (int j = 0; j < toe.length; j++)
			{
				//checks for player one input
				if (toe [i][j] == 'X')
				{
					//compares spot below to each other
					if (toe [i][j] == toe [i][j+1])
					{
						counter1++;
					}
				}
				else 
					j =3;
			}
		}
		//for columns
		for (int i = 0; i < toe.length; i++)
		{
			counter2 = 1;
			for (int j = 0; j < toe.length; j++)
			{
				if (toe[i][j] == 'X' )
				{
					if (toe [i][j] == toe [i+1][j])
					{
						counter2++;
					}
				}
			}
		}
		return win;
	}

}
