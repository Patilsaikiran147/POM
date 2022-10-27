package javaaaa;

public class Reversetheword {

	public static void main(String[] args) {
			String str = "life is short njoy the days";
			String sp[] = str.split(" ");
			for(int i=sp.length-1;i>=0;i--) {
				System.out.print(sp[i]+" ");
			}
	}

}
