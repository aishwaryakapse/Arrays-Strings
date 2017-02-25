/*Complexity is O(log(n))*/

package arraystring;

import java.util.Arrays;

public class MedianCompArrays {
	
	
	public static int median(int X[], int n){
		if(n % 2 == 0){
			return (X[n/2]+X[n/2-1])/2;
		}else{
			return X[n/2];
		}
	}
	
	public static int max(int x, int y){
		return x > y ? x : y;
	}
	
	public static int min(int x, int y){
		return x < y ? x : y;
	}

	public static double getMedian(int[] A, int[] B, int n){
		int m1, m2;
		if(n <= 0){
			return -1;
		}
		
		if(n == 1){
			return (A[0]+B[0])/2;
		}
		
		if(n == 2){
			return (max(A[0],B[0]) + min(A[1], B[1]))/2;
		}
		
		m1= median(A, n);
		m2 = median(B, n);
		
		if(m1 == m2){
			return m1;
		}
		
		if(m1 < m2){
			if(n % 2 == 0){
				return getMedian(Arrays.copyOfRange(A, n/2 -1, n), B, n-n/2 +1);
			}else{
				return getMedian(Arrays.copyOfRange(A, n/2, n), B, n-n/2);
			}
		}else{
			if(n % 2 == 0){
				return getMedian(Arrays.copyOfRange(B, n/2 -1, n), A, n-n/2 +1);
			}else{
				return getMedian(Arrays.copyOfRange(B, n/2, n), A, n-n/2);
			}
		}
		
		
		
		
	}
	public static void main(String[] args) {
		int A[] = {1, 12, 15, 26, 38};
		int B[] = {2, 13, 17, 30, 45};
		
		int n1 = A.length;
		int n2 = B.length;
		
		if(n1 == n2){
			System.out.println("The Median is: "+getMedian(A, B, n1));
		}else{
			System.out.println("Cannot Print as the Array sizes are different!!!");
		}
		

	}

}
