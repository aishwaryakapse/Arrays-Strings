package arraystring;
public class Max24Hour {
			
	public static void main(String[] args) {
		int[] A = {7, 6, 3, 5};
		
		boolean valid[] = {true, true, true, true};
		int hour = 0;
		int minute = 0;
		boolean success = false;
		
		for(int h = 24; h > 0; h--) {
			for(int i=0; i<4; i++) {
				if(h/10 == A[i] && valid[i]) {
					valid[i] = false;
					for(int j=0; j < 4; j++) {
						if(h%10 == A[j] && valid[j]) {
							valid[j] = false;
							hour = A[i]*10 + A[j];
							success = true;
							break;
						}
					}
					if(success != true) {
						valid[i] = true;
					}else{
						break;
					}
				}
			}
			if(success == true) {
				success = false;
				break;
			}
		}
		
		
		for(int m=60; m>0; m--) {
			for(int i=0; i<4; i++) {
				if(m/10 == A[i] && valid[i]) {
					valid[i] = false;
					for(int j=0; j<4; j++) {
						if(m%10==A[j] && valid[j]) {
							valid[j] = false;
							minute = A[i]*10 + A[j];
							success = true;
							break;
						}
					}
					if(success != true) {
						valid[i] = true;
					}else{
						break;
					}
				}
			}
			if(success == true) {
				success = false;
				break;
			}
		}
		
		
		if((valid[0] || valid[1] || valid[2] || valid[3]) != false){
			System.out.println("Not Possible");
		}else{
			System.out.println(hour + ":" + minute);
		}
	}

}
