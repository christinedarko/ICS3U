package darko;

import java.util.Scanner;

/**
 * Program Name: Problem Three
 * Date: November 4, 2017
 * Description: This program prints out a trident with information given from the user (height of the tines, spacing between the tines and the height of the handle).
 * @author Christine Darko
 *
 */

public class ProblemThree {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How tall would you like the tines to be?");
		int tines = sc.nextInt();
		System.out.println("What would you like the spacing of the tines to be?");
		int spacing = sc.nextInt();
		System.out.println("How long would you like the handle to be?");
		int handle = sc.nextInt();
		
		//Prints tines
		for (int i = 0; i < tines; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print("*");
				for (int k = 0; k < spacing; k++)
				{
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
		//prints centre line
		for (int i = 0; i < spacing * 2 + 3; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
		
		//prints handle
		for (int i = 0; i < handle; i++)
		{
			for (int j = 0; j < spacing + 1; j++)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < 1; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
