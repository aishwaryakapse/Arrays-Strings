
/*Complexity is O(n)*/


package arraystring;

public class MedianSortedEqArrays {
	

	public static double getMedian(int[] A, int[] B, int n){
		int i =0, j=0, count;
		double m1 = -1, m2 = -1;
		
		for(count = 0; count <= n; count++){
		
			if(i == n){
				m1 = m2;
				m2 = B[0];
				break;
			}
			
			if(j == n){
				m1 = m2;
				m2 = A[0];
			}
			
			if(A[i] < B[j]){
				m1 = m2;
				m2 = A[i];
				i++;
			}else{
				m1 = m2;
				m2 = B[j];
				j++;
			}
					
		}
		return (m1+m2)/2;
	}
	
	
	
	public static void main(String[] args) {
		int A[] = {1, 12, 15, 26, 38,79};
		int B[] = {2, 13, 17, 30, 45};
		
		int n1 = A.length;
		int n2 = B.length;
		if(n1 == n2){
			System.out.println("Median is: " + getMedian(A, B, n1));
		}else{
			System.out.println("Array Sizes not same. Cannot Calculate.");
		}
		
	}
}
