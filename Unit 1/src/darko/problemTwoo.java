package darko;
/**
 * Program Name: ProblemTwoo
 * Description: This program asks the user for an odd number above 5 and creates a bow tie of that height
 * @author Christine Darko
 */

import java.util.Scanner;

public class problemTwoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number for the height of the bow tie which is odd positive number that is greater than or equal to 5");
		int height = sc.nextInt();
		
		// Prints the top half of the bow tie
		for (int i = 1; i <= height + 1; i+=2)
		{
			//Prints left side of the bow tie
			for (int j = i; j > 0; j-- )
			{
				System.out.print("*");
			}
			for (int k = height * 2 - i*2; k > 0; k--)
			{
				System.out.print(" ");
			}
			//Prints right side of the bow tie
			for (int j = i; j > 0; j-- )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

		//Prints bottom of bow tie
		for (int i = height; i > 1 ; i-=2)
		{
			//Prints the bottom left side of the bow tie
			for(int j = i-2 ; j > 0; j--)
			{
				System.out.print("*");
			}
			//Prints the spaces between the stars
			for (int k = height*2 - (2*(i -2)) ; k > 0; k --)
			{
				System.out.print(" ");
			}
			//Prints the bottom right side of the bow tie
			for(int j = i-2 ; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
