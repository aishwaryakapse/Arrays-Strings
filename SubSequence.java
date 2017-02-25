package arraystring;
public class SubSequence {
	
	public static void main(String[] args) {
		int[] A = {1,2,3};
		int len = A.length;
		int total = 1<<len;
		for(int i=0; i< total; i++){
			System.out.println("i = "+i);
			for(int j=0; j<len; j++){
				
				if((i & (1<<j)) != 0){
					System.out.println("j = "+j);
					System.out.println(A[j]);
				}
			}
			System.out.println();
		}
	}

}
