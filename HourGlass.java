package arraystring;

public class HourGlass {
	public int hourGlass(int[][] A, int n) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=0; j<4; j++) {
				sum = (A[i][j]+ A[i][j+1] + A[i][j+2] + A[i+1][j+1] + A[i+2][j] + A[i+2][j+1] + A[i+2][j+2]);
				if(sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] A = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 6, 0, 0},
				{0, 0, 10, 0, 0, 0},
				{0, 2, 7, 0, 0, 0},
				{0, 0, 0, 0, 0, 0}
		};
		HourGlass hg = new HourGlass();
		System.out.println(hg.hourGlass(A, 6));
	}

}
