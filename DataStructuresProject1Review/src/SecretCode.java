import java.util.*;
public class SecretCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int secretCode = 50;
		int tries = 5;
		System.out.print("Welcome to People's Bank"
				+ "Please enter your secret code: ");

		
		for(int i=0; i<tries; i++){
			int quess = input.nextInt();
			if(quess != secretCode){
				System.out.print("Sorry, that is not it. Try Again: ");
			}
			else{ 
				System.out.println("Fine, go ahead.");
			}
		}
	}

}
