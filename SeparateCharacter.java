package javaaaa;

public class SeparateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="1A@ajka!lTereMerepy@aa@r4char!@c@heH@7i";
			char ch[]=str.toCharArray();
			StringBuffer sb  = new StringBuffer();
			StringBuffer sb1 = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			for(int i=0;i<str.length();i++) {
				if(Character.isAlphabetic(str.charAt(i))) {
					sb.append(str.charAt(i));
				}
				else if(Character.isDigit(str.charAt(i))) {
					sb1.append(str.charAt(i));
				}
				else{
					sb2.append(str.charAt(i));
			}
	}
			System.out.println(sb +"  "+sb1+"  "+sb2);

}
}
