package arraystring;

public class PrintArrayReverse {
	public void printArrayReverse(int[] A) {
		int l = A.length;
		for(int i=l-1; i>=0; i--) {
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
		PrintArrayReverse par = new PrintArrayReverse();
		int[] A = {1, 3, 4, 2, 4, 2};
 		par.printArrayReverse(A);
	}

}
