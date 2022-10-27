package javaaaa;

import java.util.Scanner;

public class Even_R_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the value:");
			 n = sc.nextInt();
			 if(n%2==0) {
				 System.out.println("it is even");
			 }
			 else {
				 System.out.println("it is odd");
			 }
	}

}
