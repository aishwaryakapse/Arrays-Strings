package arraystring;

public class DiagonalDifference {
	public int diagonalDifference(int[][] A, int n) {
		int left = 0;
		int right = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					left = left + A[i][j];
				}
				
				if(i+j == n-1) {
					right = right + A[i][j];
				}
			}
		}
		return Math.abs(right - left);
	}
	public static void main(String[] args) {
		int[][] A = {
				{1, 2, 4},
				{3, 5, 2},
				{2, 5, 3}
		};
		int n = A.length;
		
		DiagonalDifference dd = new DiagonalDifference();
		System.out.println(dd.diagonalDifference(A, n));
	}

}
