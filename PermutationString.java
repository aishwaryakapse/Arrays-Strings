package arraystring;

public class PermutationString {
	
	public String sort(String s){
		
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
		
	}
	
	public boolean permutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static void main(String[] args) {
		PermutationString ps = new PermutationString();
		String s = "pot";
		String t = "top";
		boolean result = ps.permutation(s, t);
		System.out.println(result);
	}

}
