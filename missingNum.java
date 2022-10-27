package javaaaa;

public class missingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num[] = new int[] {1,2,4,5};
			int total=5;
			int exp = total *((total+1)/2);
			int num_sum=0;
			for(int i:num) {
				num_sum+=i;
			}
			System.out.println(exp - num_sum);
	}

}
