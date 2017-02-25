package arraystring;

import java.util.Arrays;

public class MedianUneqSorted {
	
	public static int max(int a, int b){
		return a > b ? a : b;
	}
	
	public static int min(int a, int b){
		return a < b ? a : b;
	}
	
	public static double MO2(double a, double d){
		return (a+d)/2.0;
	}
	
	public static double MO3(int a, int b, int c){
		return a+b+c- max(a,max(b,c)) - min(a,min(b,c));
	}
	
	public static double MO4(int a, int b, int c, int d){
		int Max = max(a,max(b,max(c,d)));
		int Min = min(a,min(b,min(c,d)));
		
		return (a+b+c+d - Max - Min)/2;
	}
	
	
	public static double findMedian(int[] A, int N, int[] B, int M){
		
		if(N == 1){
			if(M == 1){
				return MO2(A[0], B[0]);
			}
			
			if(M%2 != 0){
				return MO2(B[M/2], MO3(B[M/2 -1], B[M/2 +1], A[0]));
			}
			return MO3(B[M/2], B[M/2 -1], A[0]);
		}else if(N == 2){
			if(M == 2){
				return MO4(A[0], A[1], B[0], B[1]);
			}
			if(M % 2 != 0){
				return MO3(B[M/2], max(A[0],B[M/2 -1]), min(A[1], B[M/2 +1]));
			}
			return MO4(B[M/2], B[M/2 -1], max(A[0], B[M/2 -2]), min(A[1], B[M/2 + 1]));
		}
		
		int idxA = (N - 1)/2;
		int idxB = (M - 1)/2;
		
		if(A[idxA] <= B[idxB]){
			return findMedian(Arrays.copyOfRange(A, idxA, N),N/2 + 1, B, M-idxB );
		}
		return findMedian(A, N/2 + 1,Arrays.copyOfRange(B, idxB, M), M-idxB );
		
	}
	
	public static double findMedianUtil(int[] A, int N, int[] B, int M){
		if(N > M){
			return findMedian(B,M,A,N);
		}
		return findMedian(A,N,B,M);
	}
	
	public static void main(String[] args) {
		int A[] = {900};
		int B[] = {5, 8, 10, 20};
		
		int N = A.length;
		int M = B.length;
		
		System.out.println(findMedian(A,N,B,M));
	}

}
