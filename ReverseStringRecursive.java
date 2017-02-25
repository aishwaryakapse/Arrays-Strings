package arraystring;

public class ReverseStringRecursive {
	
	public static String reverse(String str){
		if(null == str || str.length() <= 1){
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String str = "I am in love";
		String s = reverse(str);
		System.out.println(s);
	}

}
