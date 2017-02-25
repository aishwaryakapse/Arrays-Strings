package arraystring;

public class SubArray {
	
	public void subArray(int[] A, int n){
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				for(int k=i; k<=j; k++){
					System.out.print(A[k]+ " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int A[] = {1,2,3,4};
		int n = A.length;
		
		SubArray sa = new SubArray();
		sa.subArray(A, n);
		
	}

}
