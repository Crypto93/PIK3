package homework1;

import java.util.Scanner;

public class homewrokAnotherSolution3 {
	public static float a, b, c = 0;

	public static void main(String[] args) {

		inputParameters();

		findSolution();

	}

	public static void inputParameters() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter A: ");
		a = input.nextFloat();
		System.out.println("Enter B: ");
		b = input.nextFloat();
		System.out.println("Enter C: ");
		c = input.nextFloat();

		input.close();
	}

	public static void findSolution() {
		double y = 0;
		if (b == 0) {
			float xSpecial = 0;
			xSpecial = (-c) / a;

			System.out.println("When b=0, x=" + xSpecial);

			/*if (xSpecial % 10 == 0) {
				System.out.println("When b=0, x=" + xSpecial);
			} else {
				System.out.println("There are no integer solution of the equation");
			}*/
		}
		if (a == 0) {
			float ySpecial = 0;
			ySpecial = (-c) / b;

			System.out.println("When b=0, y=" + ySpecial);

			/*if (ySpecial % 10 == 0) {
				System.out.println("When b=0, y=" + ySpecial);
			} else {
				System.out.println("There are no integer solution of the equation");
			}*/
		} else {
			loop: {
				for (float x = -1000; x <= 1000; x++) {
					y = ((-(c + a * x) / b));
					if (y % 10 == 0) {
						System.out.println("x= " + x);
						System.out.println("y= " + y);
						break loop;
					}
				}
			}
		}
	}
}
