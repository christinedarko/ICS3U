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
		System.out.print("\n");
		System.out.println("This game requires two players.");
		char player1 = 'X';
		char player2 = 'o';
		char [][] ticTacToe = new char[3][3];
		for (int i = 0; i < ticTacToe.length; i ++)
		{
			for (int j = 0; j < ticTacToe.length; j++)
			{
				ticTacToe [i][j] = ' ';
			}
		}
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

		int row = 0;
		int col = 0;

		for (int i = 0; i < 9; i++)
		{
			System.out.println("Player 1 choose a spot");
			row = sc.nextInt() - 1;
			col = sc.nextInt() - 1;
			boolean emptySpace = openSpace(ticTacToe, row, col);
			while (emptySpace == false)
			{
				System.out.println("That spot's already filled");
				System.out.println("Choose a new spot");
				row = sc.nextInt() - 1;
				col = sc.nextInt() - 1;
				emptySpace = openSpace(ticTacToe, row, col);
			}
			ticTacToe [row][col] =  player1;
			boolean win = checkWin(ticTacToe, row, col);
			if (win == true)
			{
				System.out.println("PLAYER ONE WINS!!!!!!");
				break;
			}
			System.out.println("Player 2 choose a spot");
			row = sc.nextInt() - 1;
			col = sc.nextInt() - 1;
			emptySpace = openSpace(ticTacToe, row, col);
			while (emptySpace == false)
			{
				System.out.println("That spot's already filled");
				System.out.println("Choose a new spot");
				row = sc.nextInt() - 1;
				col = sc.nextInt() - 1;
				emptySpace = openSpace(ticTacToe, row, col);
			}
			ticTacToe [row][col] =  player2;
			win = checkWin(ticTacToe, row, col);
			if (win == true)
			{
				System.out.println("PLAYER TWO WINS!!!!!!");
				break;
			}
			while (i == 8 && win == false)
			{
				System.out.println("TIE GAME!");
				break;
			}
		}
	}

	public static boolean checkWin (char [][] toe, int row, int col)
	{
		int counter1 = 1;
		int counter2 = 1;
		int counter3 = 1;
		int counter4 = 1;
		char player = toe [row][col];
		boolean win = false;
		//for rows
		for (int i = 0; i < toe.length; i++)
		{
			counter1 = 1;
			for (int j = 0; j < toe.length- 1; j++)
			{
				//checks for player input
				if (toe [i][j] == player)
				{
					//compares two spots to each other
					if (toe [i][j] == toe [i][j+1])
					{
						counter1++;
						if (counter1 == 3)
						{
							win = true;
							return win;
						}
					}
				}
				else 
					j = toe.length;
			}
		}
		//for columns
		for (int i = 0; i < toe.length; i++)
		{
			counter2 = 1;
			for (int j = 0; j < toe.length; j++)
			{
				if (toe[j][i] == player )
				{
					if (toe [j][i] == toe [j+1][i])
					{
						counter2++;
						if (counter2 == 3)
						{
							win = true;
							return win;
						}
					}
				}
				else
				{
					j = toe.length;
				}

			}
		}
		// for diagonal to right
		for (int i = 0; i < toe.length - 1;)
		{
			counter3 = 1;
			for (int j = 0; j < toe.length- 1; j++, i++)
			{
				//checks for player one input
				if (toe [i][j] == player)
				{
					//compares spot below to each other
					if (toe [i][j] == toe [i+1][j+1])
					{
						counter3++;
						if (counter3 == 3)
						{
							win = true;
							return win;
						}
					}
				}
				else 
				{
					j = toe.length;
				}

			}
			return win;
		}
		//for diagonal to the left
		for (int i = 2; i >= 0;)
		{
			counter4 = 1;
			for (int j = 0; j < toe.length; j++, i--)
			{
				if (toe [j][i] == player)
				{
					if(toe [j][i] == toe [j+1][i-1])
					{
						counter4++;
						if (counter4 == 3)
						{
							win = true;
							return win;
						}
					}
				}
				else
				{
					break;
				}
			}
		}
		return win;
	}

	public static boolean openSpace (char [][] toe, int row, int col)
	{
		boolean answer = false;
		if (toe [row][col] != ' ')
		{
			return answer;
		}
		else
		{
			answer = true;
			return answer;
		}
	}
}
