package javaaaa;

public class reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="Environment",Reverse=" ";
			char ch[] =str.toCharArray();
			for(int i=str.length()-1;i>=0;i--) {
				Reverse = Reverse + ch[i];
			}
			System.out.println(Reverse);	
	}

}
