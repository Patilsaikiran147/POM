package javaaaa;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="malayala2m",Reverse="";
			char ch[]= str.toCharArray();
			for(int i=str.length()-1;i>=0;i--) {
				Reverse = Reverse + ch[i];
			}
			System.out.println(Reverse);
			if(Reverse.equals(str)) {
				System.out.println("palindrome");
			}
			else 
				System.out.println("not palindrome");
			}
	}
	

