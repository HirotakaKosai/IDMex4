import java.util.Random;
import java.util.Scanner;


public class DiceGame {
	public static void main(String[] args) {
	Random r = new Random();
	
	int a = r.nextInt(6);
	int b = r.nextInt(6);
	int total=a+b;
	int cnt=0;


	System.out.println("What is your name ?");

	Scanner scan = new Scanner(System.in);
	System.out.print(">");
	String str = scan.next();
	System.out.println("Hello, " + str + "!");
	
	System.out.println("Rolling the dice...");
	System.out.println("Die 1:"+a);
	System.out.println("Die 2:"+b);
	System.out.println("Total Value:"+total);
	if(total>7) {
		System.out.println(str +" won!");
	}else {
		System.out.println(str + "You lose");
	}
	while(total%2 != 0) {
		System.out.println("One more dice...");
		a = r.nextInt(6);
		b = r.nextInt(6);
		total=a+b;
		System.out.println("Die 1:"+a);
		System.out.println("Die 2:"+b);
		System.out.println("Total Value:"+total);
		if(total>7) {
			System.out.println( str + " won!");
		}else {
			System.out.println( str + " lose");
		}
		cnt++;
	}
	System.out.println("Your odd number count is "+cnt);
	System.out.println("Finished");
	}
	}

