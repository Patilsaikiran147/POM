package javaaaa;

public class length_of_the_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String str = "saveEnvironment";
		char[] ch = str.toCharArray();
		System.out.println("String: " + str);
		System.out.println("length of char: " + ch.length);
		int count = 0;
		for(char c:ch) {
			count++;
		}
		System.out.println("count:" + count);
}
	

}
