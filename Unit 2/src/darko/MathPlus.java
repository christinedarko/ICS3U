package darko;

import java.util.Scanner;

/**
 * Name: MathPlus
 * Description: This program asks a user for two numbers and operates them.
 * @author 324714468
 *
 */

public class MathPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The first operation we are going to do is addition. Would you like to operate integers, decimals or long numbers?");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("integers"))
		{
			System.out.println("Input 2 numbers");
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println (addition (one, two));
			System.out.println(numberOfFactors(one));
		}
		else if (response.equalsIgnoreCase("decimals"))
		{
			System.out.println("Input 2 numbers");
			double one = sc.nextDouble();
			double two = sc.nextDouble();
			System.out.println (addition (one, two));
		}
		else 
		{
			System.out.println("Input 2 numbers");
			long one = sc.nextLong();
			long two = sc.nextLong();
			System.out.println (addition (one, two));
		}
		
		System.out.println("Now we are going to subtract. Respond 1 for integers, 2 for decimals and 3 for long numbers");
		int response2 = sc.nextInt();
		if (response2 == 1)
		{
			System.out.println("Input 2 numbers");
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println (subtraction (one, two));
		}
		else if (response2 == 2)
		{
			System.out.println("Input 2 numbers");
			double one = sc.nextDouble();
			double two = sc.nextDouble();
			System.out.println (subtraction (one, two));
		}
		else
		{
			System.out.println("Input 2 numbers");
			long one = sc.nextLong();
			long two = sc.nextLong();
			System.out.println (subtraction (one, two));
		}
		
		System.out.println("Now we are going to multiply. Respond 1 for integers, 2 for decimals and 3 for long numbers");
		int response3 = sc.nextInt();
		if (response3 == 1)
		{
			System.out.println("Input 2 numbers");
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println (multiply (one, two));
		}
		else if (response3 == 2)
		{
			System.out.println("Input 2 numbers");
			double one = sc.nextDouble();
			double two = sc.nextDouble();
			System.out.println (multiply (one, two));
		}
		else
		{
			System.out.println("Input 2 numbers");
			long one = sc.nextLong();
			long two = sc.nextLong();
			System.out.println (multiply (one, two));
		}
		
		System.out.println("Now we are going to divide. Respond 1 for integers, 2 for decimals and 3 for long numbers");
		int response4 = sc.nextInt();
		if (response4 == 1)
		{
			System.out.println("Input 2 numbers");
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println (divide (one, two));
		}
		else if (response4 == 2)
		{
			System.out.println("Input 2 numbers");
			double one = sc.nextDouble();
			double two = sc.nextDouble();
			System.out.println (divide (one, two));
		}
		else
		{
			System.out.println("Input 2 numbers");
			long one = sc.nextLong();
			long two = sc.nextLong();
			System.out.println (divide (one, two));
		}
		
		System.out.println("Now we are going to make a list of numbers. Respond 1 for integers, 2 for decimals and 3 for long numbers");
		int response5 = sc.nextInt();
		System.out.println("How many numbers do you want?");
		int list = sc.nextInt();
		if (response5 == 1)
		{
			System.out.println("Input" + list + "number(s)");
			int [] sumArray = new int [list];
			for (int i = 0; i < list; i ++)
			{
				sumArray [i] = sc.nextInt();
			}
			//CJHECK MTHISSS TODAYYYYY TO SEE IF IT WORKSSSSSSSS
			// LALALALAlALALLALALALALALALLALALALLALALALALALLA
			System.out.println (min (sumArray));
		}
		else if (response5 == 2)
		{
			System.out.println("Input" + list + "number(s)");
			double [] sumArray = new double [list];
			for (int i = 0; i < list; i ++)
			{
				sumArray [i] = sc.nextDouble();
			}
			System.out.println (sumArray (sumArray));
		}
		else
		{
			System.out.println("Input" + list + "number(s)");
			long [] sumArray = new long [list];
			for (int i = 0; i < list; i ++)
			{
				sumArray [i] = sc.nextLong();
			}
			System.out.println (sumArray (sumArray));
		}
		

	}
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * sum of first and second
	 */
	public static int addition (int num1, int num2) {
		
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * sum of first and second
	 */
	public static double addition (double num1, double num2) {
		
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * sum of first and second
	 */
	public static long addition (long num1, long num2) {
		
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * difference of first and second
	 */
	public static int subtraction (int num1, int num2) {
		
		return num1 - num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * difference of first and second
	 */
	public static double subtraction (double num1, double num2) {
		
		return num1 - num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * difference of first and second
	 */
	public static long subtraction (long num1, long num2) {
		
		return num1 - num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * product of first and second
	 */
	public static int multiply (int num1, int num2) {
		
		return num1*num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * product of first and second
	 */
	public static double multiply (double num1, double num2) {
		
		return num1*num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * product of first and second
	 */
	public static long multiply (long num1, long num2) {
		
		return num1*num2; 
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * quotient of first and second
	 */
	public static int divide (int num1, int num2) {
		
		return num1/num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * quotient of first and second
	 */
	public static double divide (double num1, double num2) {
		
		return num1/num2;
	}
	
	/**
	 * 
	 * @param num1
	 * first operand
	 * @param num2
	 * second operand
	 * @return
	 * quotient of first and second
	 */
	public static long divide (long num1, long num2) {
		
		return num1/num2;
	}
	public static int sumArray(int[] num) {
		for (int i = 0; i < num.length; i++)
		{
			 num [0] = num[0] + num[i];
		}
			return num[0];
	}
	public static double sumArray(double [] num) {
		for (int i = 0; i < num.length; i++)
		{
			num [0] = num[0] + num[i];
		}
		return num[0];
	}
	public static long sumArray(long [] num) {
		for (int i = 0; i < num.length; i++) {
			num [0] = num[0] + num[i];
		}
		return num[0];
	}
	public static int factorial (int num1) {
		int factorial=num1;
		for (int i = 1; i < num1; i ++)
		{
			factorial*= i; 
		}
		return factorial;		
		
	}
	public static int numberOfFactors (int num1)
	{
		int factor = 0;
		int counter = 0;
		for (int i = 1; i <= num1; i++)
		{
			factor = num1 % i;
			if (factor == 0)
			{
				counter++;
			}
		}
		return counter;
	}
	public static int  min (int num[])
	{
		int min = num[0];
		for (int i = 0; i < num.length; i++ )
		{
			if ( min > num [i])
			{
				min = num[i];
			}
			min = i;
		}
		return min;
	}
	public static double min (double num [])
	{
		double min = (int)(num[0]);
		for (int i = 0; i < num.length; i++ )
		{
			if ( min > num [i])
			{
				min = num[i];
			}
			min = i;
		}
		return min;
	}
	public static long min (long num [])
	{
		long min = num[0];
		for (int i = 0; i < num.length; i++ )
		{
			if ( min > num [i])
			{
			min = num[i];
			return i;
			}
		}
	}
}


    