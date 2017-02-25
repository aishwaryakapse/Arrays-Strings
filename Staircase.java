package arraystring;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int spaces, stairs;
		for(int i=1; i<=n; i++){
			spaces = i;
			while(spaces <= n-1){
				System.out.print(" ");
				spaces++;
			}
			stairs = i;
			while(stairs > 0){
				System.out.print("#");
				stairs--;
			}
			System.out.println();
			input.close();
		}
	}

}
