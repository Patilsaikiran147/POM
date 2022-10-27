package javaaaa;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20,firstterm=0,secondterm=1;
		for(int i=0;i<=n;i++) {
					System.out.print(firstterm+",");
					int next = firstterm  + secondterm;
					firstterm = secondterm;
					secondterm = next;
		}
		System.out.println();
	}

}
