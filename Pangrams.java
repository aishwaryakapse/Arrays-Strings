package arraystring;
import java.util.*;
public class Pangrams {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String A = input.nextLine();
		A.toLowerCase();
		char[] A1 = A.toCharArray();
		BitSet b = new BitSet();
		for(int i=0; i<A1.length; i++){
			if(A1[i] >= 'a' && A1[i] <= 'z'){
				b.set(A1[i] - 'a');
			}
		}
		System.out.println(b.cardinality() == 26 ? "pangram" : "not a pangram");

	}

}
