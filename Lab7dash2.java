package Chap6Pack;

import java.util.Random;
import java.util.Scanner;

public class Lab7dash2 {

	/* 
	 * Computer Science 1 Spring
	 * 7-2  Math Tutor.
	 *
	 * This program calculates an equation and then prompts the user to answer the
	 * equation. The computer then checks if the users answer is correct.The program continues to 
	 * quiz the user until they exit the program.
	 */

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int choice, numProblems, maxOperand, num1, num2, answer = 0,user_answer;
		float float_answer;

		do {
			System.out.println("Math Tutor");

			System.out.println(
					"Choose the type of problem:\n" +
							"1. Addition\n" +
							"2. Subtraction\n" +
							"3. Multiplication\n" +
							"4. Division\n"+
							"5. Quit"
					);

			System.out.print("Enter your choice: \n");
			choice = sc.nextInt();

			if( choice != 5){
				System.out.print("How many problems? \n");
				numProblems = sc.nextInt();
				maxOperand = 10;

				for (int i = 0; i < numProblems; i++) {
					num1 = rnd.nextInt(maxOperand);
					num2 = rnd.nextInt(maxOperand);
					if (choice == 1) {

						add(num1, num2);

					}
					else if (choice == 2) {
						subtract(num1, num2);
					}
					else if (choice == 3) {
						multiply(num1, num2);
					}
					else if (choice == 4) {
						divide(num1, num2);
					}
				}
			}


		}while(choice !=5);

		System.out.println("Thanks for using my Math Tutor.");
	}

	public static void add(int num1, int num2) {

		Scanner sc = new Scanner(System.in);
		int answer = 0,user_answer = 0;

		System.out.printf("%d + %d = ?\n", num1, num2);
		user_answer=sc.nextInt();
		answer = num1 + num2;
		if( user_answer == answer ) {
			System.out.println("Correct!");
		} else {
			System.out.printf("Incorrect. The answer is %d.\n", answer);
		}
	}


	public static void subtract(int num1, int num2) {

		Scanner sc = new Scanner(System.in);
		int answer = 0,user_answer = 0;
		Random rnd = new Random();
		while(num1 <num2){
			num1 = rnd.nextInt(10);
			num2 = rnd.nextInt(10);
		}

		System.out.printf("%d - %d = ?\n", num1, num2);
		user_answer=sc.nextInt();
		answer = num1 - num2;
		if( user_answer == answer ) {
			System.out.println("Correct!");
		} else {
			System.out.printf("Incorrect. The answer is %d.\n", answer);
		}
	}



	public static void multiply(int num1, int num2) {

		Scanner sc = new Scanner(System.in);
		int answer = 0,user_answer = 0;

		System.out.printf("%d * %d = ?\n", num1, num2);
		user_answer=sc.nextInt();
		answer = num1 * num2;
		if( user_answer == answer ) {
			System.out.println("Correct!");
		} else {
			System.out.printf("Incorrect. The answer is %d.\n", answer);
		}
	}


	public static void divide(int num1, int num2) {

		Scanner sc = new Scanner(System.in);
		float float_answer;
		Random rnd = new Random();

		float f_num1 = rnd.nextInt(10);
		float f_num2 = rnd.nextInt(10);

		while(f_num2 ==0){
			f_num2 = rnd.nextInt(10);
		}
		System.out.printf("%f / %f = ?\n", f_num1, f_num2);
		float user_float_answer=sc.nextFloat();
		float_answer = f_num1 / f_num2;
		if( user_float_answer == float_answer ) {
			System.out.println("Correct!");
		} else {
			System.out.printf("Incorrect. The answer is %f.\n", float_answer);
		}

	}
}



	
	
	