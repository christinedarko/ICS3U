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
		System.out.println("Player 1 choose the character you would like to use. (No zeroes)");
		char player1 = sc.next().charAt(0);
		System.out.println("Player 2 choose your character.(No zeroes)");
		char player2 = sc.next().charAt(0);
		char [][] ticTacToe = new char[3][3];
		System.out.println("Since we are playing this game through java, we are going to play this differently.");
		Thread.sleep(1500);
		System.out.println("You will be playing on a 3x3 grid.");
		Thread.sleep(1500);
		System.out.println("To choose where you will place your character, you will have to use coordinates.");
		Thread.sleep(1500);
		System.out.println("The first number being the row and the second the column you'd like to place your character in.");
		Thread.sleep(1500);
		System.out.println("Rows are numbered from left to right from 1 to 3.");
		Thread.sleep(1500);
		System.out.println("Columns are numbered from top to bottom from 1 to 3");
		Thread.sleep(1500);
		System.out.println("Press enter to begin");
		sc.nextLine();
		
	}

}
