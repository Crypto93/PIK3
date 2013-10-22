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

	public static void findSolution(){
		double y=0;
		loop:{
		for (float x=-1000; x<=1000; x++){
			y=((-(c+a*x)/b));
			if (y%10==0){
				System.out.println("x= " + x);
				System.out.println("y= " + y);
				break loop;
			}
		}
		}
	}
}
