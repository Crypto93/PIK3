package homework1;

import java.util.Random;
import java.util.Scanner;

public class homeworkAnotherSolution2 {

	public static int a, b, c = 0;
	static Random rand;

	static int x, y;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		rand = new Random(System.currentTimeMillis());
		
		// Input equation parameters
		System.out.println("Enter A: ");
		a = input.nextInt();
		System.out.println("Enter B: ");
		b = input.nextInt();
		System.out.println("Enter C: ");
		c = input.nextInt();

		// invoke call to the function
		solutionFinder();
		input.close();
	}

	public static void solutionFinder() {

		do {
			x = rand.nextInt(1000);
			y = rand.nextInt(1000);
		} while (!(a * x + b * y == (-c)));

		System.out.println("reshenie : x " + x + " y:" + y);
	}
}
