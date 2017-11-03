package darko;

import java.util.Scanner;
/**
 * @author 324714468
 *
 */
public class DealOrNoDeal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cases have been opened so far?");
		int n = sc.nextInt();
		System.out.println("Indicate which amounts were eliminated by writing 1 for $100, 2 for $500, 3 for $1000 and so on until 10 for $1000000. Between each amount press the enter key");
		
		int [] amnts = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		int response;
		
		for (int i = 0; i < n; i++)
		{
			response = sc.nextInt();
			switch (response)
			{
			    case 1: amnts [0] = 0;
			    	break;
			    case 2: amnts [1] = 0;
			    	break;
			    case 3: amnts [2] = 0;
			    	break;
			    case 4: amnts [3] = 0;
					break;
			    case 5: amnts [4] = 0;
					break;
			    case 6: amnts [5] = 0;
					break;
			    case 7: amnts [6] = 0;
					break;
			    case 8: amnts [7] = 0;	
			    	break;
			    case 9: amnts [8] = 0;
			    	break;
			    case 10:amnts [9] = 0;
					break;
			}
			
		}
		int total = 0;
		for (int i = 0; i < amnts.length; i++)
		{
			total += amnts[i];
		}
		System.out.println("How much did the banker offer you?");
		int offer = sc.nextInt();
		if (offer >= total/10 )
		{
			System.out.println("deal");
		}
		else 
		{
			System.out.println("no deal");
		}
		
		
	}

}
