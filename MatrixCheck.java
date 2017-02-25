package arraystring;

public class MatrixCheck {

	
	public void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					row[i]= true;
					col[j] = true;
				}
			}
		}
		for(int i = 0; i< matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(row[i] || col[j]){
					matrix[i][j] = 0;
				}
			}
		}
		for(int i=0; i< matrix.length; i++){
			for(int j= 0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		MatrixCheck mc = new MatrixCheck();
		int[][] matrix = {
				{0, 2, 3},
				{3, 0, 5},
				{3, 5, 6}
		};
		mc.setZeros(matrix);
	}
}
