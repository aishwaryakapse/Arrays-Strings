/*There are N sequences. All of them are initially empty, and you are given a variable lastans=0. You are given Q queries of two different types:

"1 x y" - Insert y at the end of the ((x⊕lastans) mod N)th sequence.
"2 x y" - Print the value of the (y mod size)th element of the ((x⊕lastans) mod N)th sequence. Here, size denotes the size of the related sequence. Then, assign this integer to lastans.
Note: You may assume that, for the second type of query, the related sequence will not be an empty sequence. Sequences and the elements of each sequence are indexed by zero-based numbering.

The ⊕ symbol denotes the xor operation. You can get more information about it from Wikipedia. It is defined as ^^ in most of the modern programming languages.

Input Format

The first line consists of NN, number of sequences, and Q, number of queries, separated by a space. The following Q lines contains one of the query types described above.

Constraints:
 
1≤N,Q≤10^5
0≤x≤10^9
0≤y≤10^9

Output Format:
For each query of type two, print the answer on a new line.

Sample Input:

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1

Sample Output:

7
3
*/



package arraystring;

import java.util.*;
public class DynamicArray {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String l1 = input.nextLine();
		String arr1[] = l1.split(" ");
		int N = Integer.parseInt(arr1[0]);
		String arr[] = new String[(int)N];
		int Q = Integer.parseInt(arr1[1]);
		int lastans = 0;
		for(int i=0; i< Q; i++){
			String l2 = input.nextLine();
			String arr2[] = l2.split(" ");
			int decide = Integer.parseInt(arr2[0]);
			
			switch(decide){
			case 1:
				int x = Integer.parseInt(arr2[1]);
				int y = Integer.parseInt(arr2[2]);
				
				int sequence = (int) ((x^lastans)%N);
				arr[sequence] = arr[sequence]+" "+y;
				break;
			case 2:
				int p = Integer.parseInt(arr2[1]);
				int q = Integer.parseInt(arr2[2]);
				
				int seq = (int) ((p^lastans)%N);
				String arr3[] = arr[(int)seq].split(" ");
				int index = q%(arr3.length-1);
				lastans=Integer.parseInt(arr3[(int)index+1]);
                System.out.println(lastans);
                break;
			}
		}
		input.close();
	}
}