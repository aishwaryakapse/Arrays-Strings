package arraystring;

public class PermutationNew {
	
	public boolean permutationNew(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int[] check = new int[256]; // initialised to 0
		char[] s_array = s.toCharArray();
		for(char c: s_array){
			check[c]++;
		}
		for(int i=0; i<t.length(); i++){
			int c = (int)t.charAt(i);
			if(--check[c] < 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PermutationNew pn = new PermutationNew();
		boolean result = pn.permutationNew("pid", "dop");
		System.out.println(result);

	}

}
