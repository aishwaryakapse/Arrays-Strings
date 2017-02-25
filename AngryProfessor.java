package arraystring;

import java.util.Scanner;

public class AngryProfessor {
	private Scanner input;
	

	public void angryProf(){
		input = new Scanner(System.in);
		int n = Integer.valueOf(input.nextLine()); // no of students
		int k = Integer.valueOf(input.nextLine());// threshold
		int a[] = new int[n];
		for(int i=0;i<n; i++){
			a[i] = input.nextInt();
		}
		int count =0;
		for(int i=0; i<n; i++){
			if(a[i] <= 0){
				count++;
			}
		}
		if(count >= k){
			System.out.println("No. The class is not cancelled.");
		}else{
			System.out.println("Yes. The class is cancelled.");
		}
		
	}
	
	public static void main(String[] args){
		AngryProfessor ap = new AngryProfessor();
		ap.angryProf();
	}
}
