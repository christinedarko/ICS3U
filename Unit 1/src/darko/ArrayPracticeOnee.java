package darko;

 import java.util.Scanner;

 /**
  * Program Name: ArrayPracticeOnee
  * Description: This program as the user for a list names. Then outputs the names in order forwards and backwards.
  * @author Christine Darko
  *
  */
 public class ArrayPracticeOnee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of names you would like to input");
		int n = sc.nextInt();
		sc.nextLine();
		String [] names = new String [n];
		
		for (int i=0; i < n; i++)
		{
			String input;
			System.out.println("Type a name");
			input = sc.nextLine();
			names [i] = input;
		}	
			for (int j = 0; j < n; j++)
			{
				System.out.println(names [j]);
			}
			
			System.out.println("");
				for (int k = n -1; k >= 0; k--)
				{
					System.out.println(names [k]);
				}
	}

}
