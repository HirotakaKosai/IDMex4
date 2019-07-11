import java.util.Random;

public class DiceGame {
	public static void main(String[] args) {
	Random r = new Random();
	
	int a = r.nextInt(6);
	int b = r.nextInt(6);
	int total=a+b;

	System.out.println("Rolling the dice...");
	System.out.println("Die 1:"+a);
	System.out.println("Die 2:"+b);
	System.out.println("Total Value:"+total);
	if(total>7) {
		System.out.println("You won!");
	}else {
		System.out.println("You lose");
	}
	}
}
