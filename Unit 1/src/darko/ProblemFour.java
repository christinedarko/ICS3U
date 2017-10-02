package darko;

import java.util.Scanner;

/**
 * Program Name: ProblemFour
 * Date: September 25, 2017
 * @author 324714468
 *
 */
public class ProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Chip's Fast Food Emporium.");
		System.out.println("Choose a main dish.");
		System.out.println(" Type 1 for a Cheeseburger");
		System.out.println("      2 for a Fish Burger");
		System.out.println("      3 for a Veggie Burger");
		System.out.println("      4 for no main dish.");
		int main = sc.nextInt();
		if (main == 1 )
		{
			main = 461;
		}
		else if (main == 2)
		{
			main = 431;
		}
		else if (main == 3)
		{
			main = 420;
		}
		else
		{
			main = 0;
		}
		System.out.println("Choose a side dish.");
		System.out.println(" Type 1 for Fries");
		System.out.println("      2 for a Baked Potato");
		System.out.println("      3 for a Chef's Salad");
		System.out.println("      4 for no side dish.");
		int side = sc.nextInt();
		
		if (side == 1)
		{
			side = 100;
		}
		else if (side == 2)
		{
			side = 57;
		}
		else if (side == 3)
		{
			side = 70;
		}
		else
		{
			side = 0;
		}
		
		System.out.println("Choose a drink.");
		System.out.println(" Type 1 for a Soda");
		System.out.println("      2 for Orange Juice");
		System.out.println("      3 for Milk");
		System.out.println("      4 for no drink.");
		int drink = sc.nextInt();
		
		if (drink == 1)
		{
			drink = 130;
		}
		else if (drink == 2)
		{
			drink = 160;
		}
		else if (drink == 3)
		{
			drink = 118;
		}
		else 
		{
			drink = 0;
		}
		
		System.out.println("Choose a dessert.");
		System.out.println(" Type 1 for a Apple Pie");
		System.out.println("      2 for a Sundae");
		System.out.println("      3 for a Fruit Cup");
		System.out.println("      4 for no dessert.");
		int dessert = sc.nextInt();
		
		if (dessert == 1)
		{
			dessert = 167;
		}
		else if (dessert == 2)
		{
			dessert = 266;
		}
		else if (dessert == 3)
		{
			dessert = 75;
		}
		else 
		{
			dessert = 0;
		}
		
		int tCals = main + side + drink + dessert;
		
		System.out.println("The total calories of your meal is " + tCals);
	}

}
