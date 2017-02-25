package arraystring;

public class ReverseString {
	
	public void reverse(char[] str){
		int len = str.length;
		System.out.println(len);
		
		int i =0;
		int j= len-2;
		
		while(i < j){
			char temp = str[i];
			//System.out.println(temp);
			str[i] = str[j];
			//System.out.println(str[i]);
			str[j] = temp;
			//System.out.println(str[j]);
			i++;
			j--;
		}
	}

	public void display(char[] str){
		int x =0;
		while(str[x] != '\0'){
			System.out.print(str[x]);
			x++;
		}
	}
	
	public static void main(String[] args){
		char[] str = {'A', 'i', 's', 'h', '\0'};
		ReverseString rs = new ReverseString();
		rs.reverse(str);
		rs.display(str);
		
	}

}
