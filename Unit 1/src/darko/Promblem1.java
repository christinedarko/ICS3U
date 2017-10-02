package darko;

import java.util.Scanner;
/**
 * Program Name: MakeACalendar
 * Date: September 22, 2017
 * @author Christine Darko
 */
public class Promblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number 1 through 7 for the day you'd like the month to start on, 1 being Sunday and 7 being Saturday.");
		int day = sc.nextInt();
		System.out.println("Input a number (28 through 31) which indicates how long you'd like the month to be.");
		int length = sc.nextInt();
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			if (day == 2 )
			{
				System.out.print("\t");
			}
			else if (day == 3)
			{
				System.out.print("\t\t");
			}
			else if (day == 4)
			{
				System.out.print("\t\t\t");
			}
			else if (day ==5 )
			{
				System.out.print("\t\t\t\t");
			}
			else if (day == 6 )
			{
				System.out.print("\t\t\t\t\t");
			}
			else if (day == 7)
			{
				System.out.print("\t\t\t\t\t\t");
			}
			
		for (int i=1; i<=length; i++, day++)
		{
			System.out.print(i);
			System.out.print("\t");
			
			if (day == 7)
			{
				System.out.println();
				day = 0;
			}
		}
	}

}
