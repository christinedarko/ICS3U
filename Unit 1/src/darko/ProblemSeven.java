/**
 * 
 */
package darko;

import java.util.Scanner;
/**
 * Program Name: ProblemSeven
 * Date: September 26, 2017
 * @author Christine Darko
 */
public class ProblemSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 10 inclusive");
		int x = sc.nextInt();
	
			while (x < 1 || x > 10 ) 
			{
				System.out.println("Pick a number between 1 and 10 inclusive");
				x = sc.nextInt();
			}
		if (x == 1 || x == 9 || x == 10)
		{
			System.out.println("There is one way to show this number with your fingers");
		}
		else if (x == 2 || x==3 || x == 7 || x == 8)
		{
			System.out.println("There are two ways to show this number with your fingers");
		}
		else
		{
			System.out.println("There are three ways to show this number with your fingers");
		}
	}

}