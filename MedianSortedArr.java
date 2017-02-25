package arraystring;

public class MedianSortedArr {
	
	public static int getMedian(int[] arr1, int[] arr2, int n){
		return getMedianRec(arr1,arr2,0,n-1,n);
	}
	
	public static int getMedianRec(int[] arr1, int[] arr2, int left, int right, int n){
		int i,j;
		if(left > right){
			return getMedianRec(arr2, arr1, 0, n-1, n);
		}
		
		i = (left + right)/2;
		j = n - i -1;
		
		if(arr1[i] > arr2[j] && (j == n-1 || (arr1[i] < arr2[j+1]))){
			
			//arr1 = m2... Now to find m1
			if(i == 0 || arr1[i-1] < arr2[j]){
				return (arr1[i] + arr2[j])/2;
			}else{
				return (arr1[i] + arr1[i-1])/2;
			}
			
		}else if(arr1[i] > arr2[j] && arr1[i] > arr2[j+1] && j != n-1){
			return getMedianRec(arr1, arr2, left, i-1, n); 
		}else{
			return getMedianRec(arr1, arr2, i+1, right, n);
		}
		
	}
	
	public static void main(String[] args){
		// stackoverflow error occurs if the recusion size is too small. Earlier was checking on input of 5 nos
		// After increasing the size of input arrays the result is seen and no stack overflow error shows
		int[] arr1 = {1, 3, 5, 7, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
		int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		if(n1 == n2){
			System.out.println("Median is: "+getMedian(arr1,arr2,n1));
			}else{
				System.out.println("Doesn't work for arrays of unequal size");
		}
	}

}
