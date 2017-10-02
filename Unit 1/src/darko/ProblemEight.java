package darko;

import java.util.Scanner;
/**
 * Program Name: ProblemEight
 * Date: September 26, 2017
 * @author Christine Darko
 */
public class ProblemEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		String name = sc.nextLine();
		System.out.println("How many tiles do you have " + name);
		int tiles = sc.nextInt();
		int square = (int)Math.sqrt(tiles);
		System.out.println("The biggest square you can make will have a side length of " + square);
	}

}
