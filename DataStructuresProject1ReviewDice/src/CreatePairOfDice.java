import java.util.*;

public class CreatePairOfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dice1 = new Die();
		Die dice2 = new Die();
		int random1 = (int) (Math.random() * 7);
		int random2 = (int) (Math.random() * 7);
		dice1.setDie(random1);
		dice1.printValue();
		System.out.println();
		dice2.setDie(random2);
		dice2.printValue();
	}
}
