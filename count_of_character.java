package javaaaa;

public class count_of_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="malayalam";
			char c[]=str.toCharArray();
			for(char ch='a';ch<='z';ch++) {
				int count=0;
				for(int i=0;i<=str.length()-1;i++) {
					if(ch==c[i]) {
						count++;
					}
				}
				if(count>0) {
					System.out.println(ch+"="+count);
				}
			}
	}
}
