package darko;

import java.util.Scanner;
/**
 * @author 324714468
 *
 */
public class MagicSquare {


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[][] square = new int [4][4];
		System.out.println("Enter 16 numbers you think will make a majic square");
		for (int i = 0; i < square.length; i++)
		{
			for (int j = 0; j < square[i].length; j++)
			{
				System.out.print("next");
				square [i][j] = sc.nextInt();
			}
		}
		
		// To add up all the values 
		int total = square[0][0] + square[0][1] + square[0][2] + square[0][3];
		int sum = 0;
		for (int i = 0; i < square.length; i ++)
		{
			for (int j = 0; j < square[i].length; j++)
			{
				sum = sum + square[j][i];
			}
			
		}
		
		
		int rowZero = square[0][0] + square[0][1] + square[0][2] + square[0][3];
		int rowOne = square[1][0] + square[1][1] + square[1][2] + square[1][3];
		int rowTwo = square[2][0] + square[2][1] + square[2][2] + square[2][3];
		int rowThree = square[3][0] + square[3][1] + square[3][2] + square[3][3];
		
		int cZero = square[0][0] + square[1][0] + square[2][0] + square[3][0];
		int cOne = square[0][1] + square[1][1] + square[2][1] + square[3][1];
		int cTwo = square[0][2] + square[1][2] + square[2][2] + square[3][2];
		int cThree = square[0][3] + square[1][3] + square[2][3] + square[3][3];
		if (rowZero == rowOne && rowZero == rowTwo && rowZero == rowThree && cZero == cOne && cZero == cTwo && cZero == cThree)
		{
			System.out.println("This is a majic square");
		}
		else
		{
			System.out.print("This is not a majic square");
		}
	}

}
