package arraystring;

import java.util.Scanner;

public class MakeAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String A1 = input.nextLine();
		String A2 = input.nextLine();
		int[] check1 = new int[26];
		int[] check2 = new int[26];
		for(int i=0; i<A1.length(); i++){
			char c = A1.charAt(i);
			check1[c - 'a']++;
		}
		for(int i=0; i<A2.length();i++){
			char c = A2.charAt(i);
			check2[c - 'a']++;
		}
		int sum=0;
		for(int i=0; i<26; i++){
			sum = sum + Math.abs(check1[i] - check2[i]);
		}
		System.out.println(sum);
		input.close();
	}

}
