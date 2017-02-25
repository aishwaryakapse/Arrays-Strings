package arraystring;

public class StringCompressBetter {
	
	public String compressBetter(String str){
		//Check if compression would give a longer string
		int size = countCompression(str);
		if(size > str.length()){
			return str;
		}
		StringBuffer mystr = new StringBuffer();
		int count = 1;
		char last = str.charAt(0);
		for(int i=0; i<str.length(); i++){
			if(last == str.charAt(i)){
				count++;
			}else{
				mystr.append(last);//append char
				mystr.append(count);//append count
				last = str.charAt(i);
				count = 1;
			}
		}
		
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}
	
	public int countCompression(String str){
		
		//check if the string is null or empty
		if(str == null || str.isEmpty()){
			return 0;
		}
		int size = 0;
		char last = str.charAt(0);
		int count = 1;
		for(int i=0; i<str.length(); i++){
			if(last == str.charAt(i)){
				count++;
			}else{
				last = str.charAt(i);
				size = size + 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
		
	}
	
	public static void main(String[] args) {
		
		StringCompressBetter scb = new StringCompressBetter();
		String str = "aabbbbccccccccccccccccccccddddddd";
		String mystr = scb.compressBetter(str);
		System.out.println(mystr);

	}

}
