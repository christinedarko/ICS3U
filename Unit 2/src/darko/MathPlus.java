package darko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Name: MathPlus
 * Description: This program asks a user for two numbers and operates them.
 * @author 324714468
 *
 */

public class MathPlus {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(quadratic(1.0, 4.0, 4.0 ));
		}
		catch (ArithmeticException e)
		{
			System.err.println("ERROR");
		}
		
		System.out.println("The first operation we are going to do is addition. Would you like to operate integers, decimals or long numbers?");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("integers"))
		{
			System.out.println("Input 2 numbers");
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println (listOfFactors (two));
			System.out.println(numOfFactors(one));
		}
		else if (response.equalsIgnoreCase("decimals"))
		{
			System.out.println("Input 2 numbers");
			double one = sc.nextDouble();
			double two = sc.nextDouble();
			System.out.println (add (one, two));
		}
		else 
		{
			System.out.println("Input 2 numbers");
			long one = sc.nextLong();
			long two = sc.nextLong();
			System.out.println (add (one, two));
		}
		
		System.out.println("Now we are going to subtract. Respond 1 for integers, 2 for decimals and 3 for long numbers");
		int response2 = sc.nextInt();
		if (response2 == 1)
		{
			System.out.println("Input 2 numbers");
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println (subtract (one, two));
		}
		else if (response2 == 2)
		{
			System.out.println("Input 2 numbers");
			double one = sc.nextDouble();
			double two = sc.nextDouble();
			System.out.println (subtract (one, two));
		}
		else
		{
			System.out.println("Input 2 numbers");
			long one = sc.nextLong();
			long two = sc.nextLong();
			System.out.println (subtract (one, two));
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
			System.out.println (sum (sumArray));
		}
		else
		{
			System.out.println("Input" + list + "number(s)");
			long [] sumArray = new long [list];
			for (int i = 0; i < list; i ++)
			{
				sumArray [i] = sc.nextLong();
			}
			System.out.println (sum (sumArray));
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
	public static int add (int num1, int num2) {
		
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
	public static double add (double num1, double num2) {
		
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
	public static long add (long num1, long num2) {
		
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
	public static int subtract (int num1, int num2) {
		
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
	public static double subtract (double num1, double num2) {
		
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
	public static long subtract (long num1, long num2) {
		
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
	public static int sum (int[] num) {
		for (int i = 0; i < num.length; i++)
		{
			 num [0] = num[0] + num[i];
		}
			return num[0];
	}
	public static double sum (double [] num) {
		for (int i = 0; i < num.length; i++)
		{
			num [0] = num[0] + num[i];
		}
		return num[0];
	}
	public static long sum (long [] num) {
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
	public static int numOfFactors (int num1)
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
			}
			min = i;
		}
		return min;
	}
	public static int max (int num[])
	{
		int max = num[0];
		for (int i = 0; i < num.length; i++ )
		{
			if ( max < num [i])
			{
				max = num[i];
			}
			max = i;
		}
		return max;
	}
	public static double max (double num[])
	{
		double max = num[0];
		for (int i = 0; i < num.length; i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
			max = i;
		}
		return max;
	}
	public static long max (long num[] )
	{
		long max = num[0];
		for (int i = 0; i < num.length; i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
			max = i;
		}
		return max;
	}
	
	public static double hypotenuse (double num1, double num2)
	{
		double c = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
		return c;
	}
	
	public static int [] factors (int num1)
	{
		int numOfFactors = (numOfFactors (num1));
		int [] factors = new int [numOfFactors];
		int counter = 0;
		int x = 0;
		for (int i = 1; i <= num1; i ++)
		{
			x = num1/i;
			if ( num1 % i == 0)
			{
				factors [counter] = x;
				counter++;
			}
		}
		return factors;
	}
	public static ArrayList<Integer> listOfFactors (int num1)
	{
		
		ArrayList<Integer>  factors = new ArrayList<Integer>( numOfFactors (num1));
		int x = 0;
		for (int i = 1; i <= num1; i ++)
		{
			x = num1/i;
			if ( num1 % i == 0)
			{
				factors.add (x);
			}
		}
		for (int i = 0; i < factors.size(); i++)
		{
			System.out.println(factors.get(i));
		}
		return factors;
	}
	public static double mean (double [] nums )
	{
		double total = 0;
		for (int i = 0; i < nums.length; i++)
		{
			total+= nums[i];
		}
		total /= nums.length;
		return total;
	}
	public static double median (double [] nums)
	{
		double[] ascending = Arrays.copyOf(nums, nums.length);
		Arrays.sort(ascending);
		int length = ascending.length/2;
		double median = 0;
		if (length % 2 != 0)
		{
			median = (ascending[(length/2)] + ascending[(length/2)-1])/2;
		}
		else
		{
			median = ascending[length];
		}
		return median;
	}
	public static double mode (double [] nums)
	{
		double[] list = Arrays.copyOf(nums, nums.length);
		Arrays.sort(list);
		int counter = 1;
		double modeCheck = 0;
		double mode = 0;
		for (int i= 0; i < list.length - 1; i++)
		{
			counter = 1;
			for (int j = i+1; j < list.length; j++)
			{
				if (list[i] == list [j])
				{
					counter++;
				}
				
			}
			if (counter > modeCheck)
			{
				modeCheck = counter;
				mode = list[i];
			}
		}
		return mode;
	}
	public static double [] quadratic (double a, double b, double c) throws ArithmeticException
	{
		double discriminant = b*b - 4*a*c;
		if (discriminant == 0)
		{
			double [] roots = new double [1];
			roots[0] = (-b) / 2* a;
			return roots;
		}
		else if (discriminant > 0)
		{
			double [] roots = new double [2];
			
				roots [0] = ((-b) + Math.sqrt(b*b - 4 * a * c)) / 2;
				roots [1] = ((-b) - Math.sqrt(b*b - 4 * a * c)) / 2;
				return roots;
		}
		else
		{
			throw new ArithmeticException("No Real Roots");
		}
	}
}


    