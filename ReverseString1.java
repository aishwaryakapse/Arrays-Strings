package arraystring;

import java.util.Arrays;

public class ReverseString1 {
	
	public String reverse(String str){
		char[] str1 = str.toCharArray();
		char temp;
		for(int i=0; i<str1.length/2; i++){
			temp = str1[i];
			str1[i] = str1[str1.length-1-i];
			str1[str1.length-1-i] = temp;
		}
		return Arrays.toString(str1);
	}
	
	public String reverse1(String str){
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	
	
	public static void main(String[] args) {
		String x = new String("The sky is blue");
		for(int i=x.length()-1; i>=0; i--){
			System.out.print(x.charAt(i));
		}
		System.out.println();
		
		ReverseString1 rs1 = new ReverseString1();
		String str = "This is awesome";
		
		System.out.println(rs1.reverse(str));
		System.out.println(rs1.reverse1(str));
		
	}
}
