package javaaaa;

import java.util.Scanner;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not prime number");
		}
	}

}
