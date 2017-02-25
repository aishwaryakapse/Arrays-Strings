package arraystring;
import java.util.*;
public class StringOccurence {
	public void stringOccurence(String[] set, String[] input) {
		for(int i = 0; i < input.length; i++) {
			int count = 0;
			for(int j=0; j<set.length; j++) {
				if(input[i].equals(set[j])) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	public void stringOccurenceI(String[] set, String[] input) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<set.length; i++) {
			if(map.containsKey(set[i])) {
				map.put(set[i],map.get(set[i])+1);
			}else {
				map.put(set[i], 1);
			}
		}
		
		for(int i=0; i<input.length; i++) {
			if(map.containsKey(input[i])) {
				System.out.println(input[i] +" : "+ map.get(input[i]));
			}
		}
	}
	public static void main(String[] args) {
		String[] set = {
				"Aishwarya",
				"Kapse",
				"Shalaka",
				"Aishwarya",
				"Aishwarya",
				"Kapse"
		};
		String[] input = {"Aishwarya", "Kapse", "Shalaka", "Kshitij"};
		StringOccurence so = new StringOccurence();
		so.stringOccurence(set, input);
		so.stringOccurenceI(set, input);
	}

}
