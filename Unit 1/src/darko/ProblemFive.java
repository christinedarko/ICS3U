package darko;

import java.util.Scanner;
/**
 * @author 324714468
 *
 */
public class ProblemFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the weight of the first bowl?");
		int bowlOne = sc.nextInt();
		System.out.println("What is the weight of the second bowl?");
		int bowlTwo = sc.nextInt();
		System.out.println("What is the weight of the third bowl?");
		int bowlThree = sc.nextInt();
		
		if (bowlOne > bowlTwo && bowlOne < bowlThree || bowlOne > bowlThree && bowlOne < bowlTwo)
		{
			System.out.println("Mama Bear's bowl weighs " + bowlOne + " pounds");
		}
		else if (bowlTwo > bowlOne && bowlTwo < bowlThree || bowlTwo > bowlThree && bowlTwo < bowlOne)
		{
			System.out.println("Mama Bear's bowl weighs " + bowlTwo + " pounds");
		}
		else 
		{
			System.out.println("Mama Bear's bowl weighs " + bowlThree + " pounds");
		}
	}

}
