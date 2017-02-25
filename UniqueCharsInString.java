package arraystring;

public class UniqueCharsInString {

	
	public boolean isUnique(String str){
		if(str.length() > 256){
			return false;
		}
		
		boolean[] check = new boolean[256];
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			if(check[val]){
				return false;
			}
			check[val] = true;
		}
		return true;
	}
	
	public boolean isUniqueBit(String str){
		
		// Assuming only lowercase alphabets
		int check = 0;
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i) - 'a';
			if((check & (1<<val)) > 0){
				return false;
			}
			check = check | (1<<val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		UniqueCharsInString ucs = new UniqueCharsInString();
		boolean result = ucs.isUnique("abcdea");
		System.out.println(result);
		
		result = ucs.isUniqueBit("abcdea");
		System.out.println(result);
		
	}

}
