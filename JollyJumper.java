package arraystring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class JollyJumper {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while((input = br.readLine()) != null && !input.trim().equals("\n") && !input.trim().equals("")){
			String[] data = input.split("\\s+");
			int noi = Integer.parseInt(data[0]);
			if((data.length - 1) != noi){
				System.out.println("Wrong Input");
				System.exit(1);
			}
			
			BitSet b = new BitSet(noi);
			boolean isJolly = true;
			
			for(int i=1; i<data.length-1; i++){
				int diff = Math.abs(Integer.parseInt(data[i]) - Integer.parseInt(data[i+1]));
				if(diff < 1 || diff >= noi || b.get(diff)){
					System.out.println("Not Jolly");
					isJolly = false;
					break;
				}
				b.set(diff);
			}
			
			if(isJolly){
				System.out.println("Jolly");
			}
		}
	}

}
