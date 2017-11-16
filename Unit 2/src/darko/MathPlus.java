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
			System.out.println (sum (sumArray));
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
	 * This method finds the sum of the first and second operand
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
	 * This method finds the sum of the first and second operand
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
	 * This method finds the sum of the first and second operand
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
	 * This method finds the difference of the first and second operand
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
	 * This method finds the difference of the first and second operand
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
	 * This method finds the difference of the first and second operand
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
	 * This method finds the product of the first and second operand
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
	 * This method finds the product of the first and second operand
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
	 * This method finds the product of the first and second operand
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
	 * This method divides the first operand  by the second
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
	 * This method divides the first operand  by the second
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
	 * This method divides the first operand  by the second
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
	
	/**
	 * This method finds the sum of the values given in an array
	 * @param num
	 * array filled with integer numbers
	 * @return
	 * the sum of all the numbers
	 */
	public static int sum (int[] num) {
		for (int i = 0; i < num.length; i++)
		{
			 num [0] += num[i];
		}
			return num[0];
	}
	
	/**
	 * This method finds the sum of the values given in an array
	 * @param num
	 * array filled with double values
	 * @return
	 * the sum of all the values
	 */
	public static double sum (double [] num) {
		for (int i = 0; i < num.length; i++)
		{
			num [0] = num[0] + num[i];
		}
		return num[0];
	}
	
	/**
	 * This method finds the sum of the values given in an array
	 * @param num
	 * array filled with long numbers
	 * @return
	 * the sum of all the values
	 */
	public static long sum (long [] num) {
		for (int i = 0; i < num.length; i++) {
			num [0] = num[0] + num[i];
		}
		return num[0];
	}
	
	/**
	 * This method multiplies the number given by every integer number below it not including zero
	 * @param num1
	 * an integer number greater than zero
	 * @return
	 * the product of every integer number below the given value 
	 */
	public static long factorial (int num1) {
		int factorial=num1;
		for (int i = 1; i < num1; i ++)
		{
			factorial*= i; 
		}
		return factorial;		
		
	}
	
	/**
	 * This method finds the amount of factors the given number has
	 * @param num1
	 * integer number that is being tested
	 * @return
	 * the amount of factors the given number has
	 */
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
	
	/**
	 * This method finds the lowest number in a array
	 * @param num
	 * The array that contains a list of numbers
	 * @return
	 * the spot number in the array where the minimum number lies
	 */
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
	
	/**
	 * This method finds the lowest number in a array
	 * @param num
	 * The array that contains a list of numbers
	 * @return
	 * the spot number in the array where the minimum number lies
	 */
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
	
	/**
	 * This method finds the lowest number in a array
	 * @param num
	 * The array that contains a list of numbers
	 * @return
	 * the spot number in the array where the minimum number lies
	 */
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
	
	/**
	 * This method finds the largest number in a array
	 * @param num
	 * The array that contains a list of numbers
	 * @return
	 * the spot number in the array where the maximum number lies
	 */
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
	
	/**
	 * This method finds the largest number in a array
	 * @param num
	 * The array that contains a list of numbers
	 * @return
	 * the spot number in the array where the maximum number lies
	 */
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
	
	/**
	 * This method finds the largest number in a array
	 * @param num
	 * The array that contains a list of numbers
	 * @return
	 * the spot number in the array where the maximum number lies
	 */
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
	
	/**
	 * This method finds the hypotenuse of of a triangle
	 * @param num1
	 * the height of the triangle
	 * @param num2
	 * the base of the triangle
	 * @return
	 */
	public static double hypotenuse (double num1, double num2)
	{
		double c = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
		return c;
	}
	
	/**
	 * This method finds the factors of the number given
	 * @param num1
	 * the number that is being tested
	 * @return
	 * a list of factors 
	 */
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
	
	/**
	 * This method finds the factors of the number given
	 * @param num1
	 * the number that is being tested
	 * @return
	 * a list of factors in a array list
	 */
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
	
	/**
	 * This method finds the average of all the numbers in the array
	 * @param nums
	 * all the operands
	 * @return
	 * the average of all the numbers in the array
	 */
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
	
	/**
	 * This method finds the middle number in an ascending list of numbers. If there is more than one, it finds the average of the two
	 * @param nums
	 * list of numbers being tested
	 * @return
	 * returns the median
	 */
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
	
	/**
	 * This method finds the number in a list that repeats the most
	 * @param nums
	 * the list of numbers being tested
	 * @return
	 * returns the mode
	 */
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
		if (modeCheck > 1) 
		{
			return mode;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * This method finds the roots of a quadratic equation arranged in standard form
	 * @param a
	 * the a value 
	 * @param b
	 * the b value
	 * @param c
	 * the c value
	 * @return
	 * returns the root(s) of the of the equation, if there aren't any it will return a message 
	 * @throws ArithmeticException
	 */
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
	
	/**
	 * This method finds the permutation using the numbers given by the user
	 * @param n
	 *  the amount of the numbers the user can choose from
	 * @param r
	 *  the number the user has chosen
	 * @return
	 */
	public static long permut (int n, int r)
	{
		long permutation = factorial(n)/factorial(n-r);
		return permutation;
	}
	
	/**This method finds the combination using the numbers given by the user
	 * @param n
	 *  the amount of the numbers the user can choose from
	 * @param r
	 *  the number the user has chosen
	 * @return
	 */
	public static long comb (int n, int r)
	{
		long combination = factorial(n)/(factorial(n-r) * factorial(r));
		return combination;
	}
	
}


    