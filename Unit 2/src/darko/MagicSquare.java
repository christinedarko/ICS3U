package darko;

import java.util.Scanner;
/**
 * Program Name: Magic Square
 * Date: October 23, 2017
 * Description: This program asks a user to make a square of numbers. If each row and column are equal to each other, the square is magic.
 * @author 324714468
 *
 */
public class MagicSquare {


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("How long and wide do you want the square to be?");
		int n = sc.nextInt();
		int[][] square = new int [n][n];
		int amnt = (int)(Math.pow(n, 2));
		System.out.println("Enter " +  amnt + " numbers you think will make a majic square. Use the space bar to seperate all the numbers. I will tell you if it is magic or not.");
		for (int i = 0; i < square.length; i++)
		{
			for (int j = 0; j < square[i].length; j++)
			{
				square [i][j] = sc.nextInt();
			}
		}
		
		// To add up the rows
		int total = 0;
		for (int i = 0; i < square.length; i++)
		{
			for (int j = 0; j < square.length; j++)
			{
				total = total + square[i][j];
			}
		}
		//to add up the columns
		int sum = 0;
		for (int i = 0; i < 1; i ++)
		{
			for (int j = 0; j < square[i].length; j++)
			{
				sum = sum + square[j][i];
			}
			
		}
	
		if (sum * n == total)
		{
			System.out.println("magic");
		}
		else 
		{
			System.out.println("not magic");
		}
		
	}
	
}