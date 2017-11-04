package darko;

import java.util.Scanner;
/**
 * Program Name: ProblemSix
 * Description: This program finds the 1 to 3 sum of three numbers plus a constant number
 * @author 324714468
 *
 */
public class ProblemSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the first number between 1 and 9 inclusive");
		int first = sc.nextInt();
		System.out.println("Write the second number between 1 and 9 inclusive");
		int second = sc.nextInt();
		System.out.println("Write the third number between 1 and 9 inclusive");
		int third = sc.nextInt();
		int constant = 120;
		int total = constant + (first*1) + (second*3) + (third*1);
		System.out.println("The 1 to 3 sum is " + total);
	}

}
