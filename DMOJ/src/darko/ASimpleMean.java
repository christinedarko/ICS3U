package darko; //libc

import java.util.Scanner; //features libc
public class ASimpleMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Input three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mean = (a + b + c)/3;
		System.out.println(mean);
		
	}

}
