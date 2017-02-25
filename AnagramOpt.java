package arraystring;

public class AnagramOpt {
	
	
	public boolean permutationString(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters =new int[256];//each initialized to 0
		//System.out.println(letters[65]);
		
		char[] s_array = s.toCharArray();
		for(char c: s_array){ // count number of each character in s_array
			letters[c]++;
			//System.out.println("char "+c+" "+letters[c]);
		}
		
		for(int i=0; i<t.length(); i++){
			int c = (int)t.charAt(i);
			if(--letters[c] < 0){
				return false;
			}
			
		}
				
		return true;
	}

	public static void main(String[] args) {
		AnagramOpt ao = new AnagramOpt();
		String s = "aan";
		String t = "nam";
		boolean result = ao.permutationString(s, t);
		System.out.println(result);
	}

}
