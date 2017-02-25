package arraystring;

public class StringCompression {
	
	public String compressBad(String str){
		String mystr = ""; // initialize empty string
		int count = 1;
		char last = str.charAt(0);
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == last){
				count++;
			}else{
				mystr += last + "" +count;
				last = str.charAt(i);
				count = 1;
			}
		}
		return mystr + last +count;
	}

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		String str = "aabbbbccccdddd";
		String mystr = sc.compressBad(str);
		
		System.out.println(mystr);

	}

}
