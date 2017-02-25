package arraystring;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		for(int i=0; i<n; i++){
			String str = in.nextLine();
			char[] str1 = str.toCharArray();
			int l =0;
			int r = str1.length-1;
			while(l<r){
				if(str1[l] == str1[r]){
					l++;
					r--;
				}else{
					break;
				}
			}
			if(l >= r){
				System.out.println(-1); // already a palindrome
				continue; // to go to next string
	 		}
			int saveLeft = l;
			int saveRight = r;
			l++;
			int leftFault = 1;
			while(l < r){
				if(str1[l] == str1[r]){
					l++;
					r--;
				}else{
					leftFault = 0;
					break;
				}
			}
			if(leftFault == 1){
				System.out.println(saveLeft);
			}else{
				System.out.println(saveRight);
			}

		}
		in.close();
	}
}
