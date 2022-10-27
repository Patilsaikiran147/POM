package javaaaa;

public class Largest_Smallest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a[]= {1,50,100,18,7,147};
				int smallest=a[0];
				int largest=a[0];
				for(int i=0;i<=a.length-1;i++) {
					if(a[i]>largest) {
						largest=a[i];
					}
					else if(a[i]<smallest) {
						smallest=a[i];
					}
				}
				System.out.println("smallest array:"+ smallest);
				System.out.println("largest array:"+ largest);
	}

}
