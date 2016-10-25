import java.util.*;
public class SecretNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secretNumber = (int)(Math.random() * 100);
		int stop = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Guess: ");
		
		for(int i=0; i<=100; i++){
			int quess = input.nextInt();
			if(quess == 0){
				System.out.println("Program Ended.");
				break;
			}
			if(secretNumber - quess > 30){
				System.out.println("Way Too Low. Quess again: ");
			}
			if(secretNumber - quess < -30){
				System.out.println("Way Too High. Quess again: ");
			}
			if((secretNumber - quess > 10) && (secretNumber - quess < 30)){
				System.out.println("Low. Try Again: ");
			}
			if((secretNumber - quess < -10) && (secretNumber - quess > -30)){
				System.out.println("High. Try Again: ");
			}
			if((secretNumber - quess < 10) && (secretNumber - quess > 0)){
				System.out.println(" Little Low. Try Again: ");
			}
			if((secretNumber - quess > -10) && (secretNumber - quess < 0)){
				System.out.println(" Little High. Try Again: ");
			}
			if(secretNumber == quess){
				System.out.println("Correct.");
				break;
			}
		}
	}

}
