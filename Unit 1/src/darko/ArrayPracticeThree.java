package darko;

/**
 * Program Name: ArrayPracticeThree
 * Description: This program rolls two die 10000 times and outputs how many times the totals of the two die together were rolled.
 * @author Christine Darko
 *
 */

public class ArrayPracticeThree {

	public static void main(String[] args) {
		
		int [] total = new int[11];
		int dieOne;
		int dieTwo;
		
		// Calculates the amount of rolls for each number on the die
		for (int i = 0; i < 10000; i++)
		{
			dieOne = (int)(Math.random()*6)+1;
			dieTwo = (int)(Math.random()*6)+1;
			int roll = dieOne + dieTwo;
			if (roll == 2)
			{
				total [0] ++;
			}
			else if (roll == 3)
			{
				total[1] ++;
			}
			else if (roll == 4)
			{
				total [2] ++;
			}
			else if (roll == 5)
			{
				total [3] ++;
			}
			else if (roll == 6)
			{
				total [4] ++;
			}
			else if (roll == 7)
			{
				total [5] ++;
			}
			else if (roll == 8)
			{
				total [6] ++;
			}
			else if (roll == 9)
			{
				total [7] ++;
			}
			else if (roll == 10)
			{
				total [8] ++;
			}
			else if (roll == 11)
			{
				total [9] ++;
			}
			else if (roll == 12)
			{
				total [10] ++;
			}
		}
		System.out.println("Totals\t\t\t\tNumber of Rolls");
		
		//Prints out the totals and the number or rolls in columns
		int j = 2;
		for (int i = 0 ; i < 11; i++)
		{ 
			System.out.println( j + "\t\t\t\t\t" + total [i]);
			j ++;
		}
	}

}
