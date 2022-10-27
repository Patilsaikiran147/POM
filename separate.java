package javaaaa;

public class separate {

	public static void main(String[] args) {
// from given string, i need only alphabetic letter
		String s ="a1b@c123@#@";
	StringBuffer sb = new StringBuffer();
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(Character.isAlphabetic(s.charAt(i))) {
			sb.append(s.charAt(i));
		}
	}	System.out.println(sb);
	
	}
}
