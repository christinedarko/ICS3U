package darko;

import java.util.Scanner;

public class problemTwoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number for the height of the bow tie which is odd positive number that is greater than or equal to 5");
		int height = sc.nextInt();
		
		for (int i = 1; i <= height + 1; i+=2)
		{
			for (int j = i; j > 0; j-- )
			{
				System.out.print("*");
			}
			for (int k = height * 2 - i*2; k > 0; k--)
			{
				System.out.print(" ");
			}
			for (int j = i; j > 0; j-- )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
