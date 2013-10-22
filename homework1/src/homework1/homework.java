package homework1;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter A: ");
		int a = input.nextInt();
		System.out.println("Enter B: ");
		int b = input.nextInt();
		System.out.println("Enter C: ");
		int c = input.nextInt();

		System.out.printf("%dx+%dy+%d=0", a, b, c);
		System.out.println();

		loop: {
			for (int x = -1000; x <= 1000; x++) {
				for (int y = -1000; y <= 1000; y++) {
					int sum = 0;
					sum = a * x + b * +y + c;
					if (sum == 0) {
						System.out.printf("x= %d  y= %d", x, y);
						System.out.println();
						break loop;
					}
				}
			}
		}
		
		System.out.println("no solution");

		input.close();
	}

}
