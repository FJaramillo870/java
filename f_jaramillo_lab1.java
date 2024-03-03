/*Assignment 1:
Create a simple calculator that will do an addition,
a subtraction, a multiplication, and a division between
2 user chosen doubles.

Requirements:
- Create 2 variables that are of the type double.
- Ask the user for their input for both variables.
- Create 4 variables that will store the results of each
  of the math operations.
- Print out the results of each math operation to the
  terminal.
*/

import java.util.Scanner;

public class calculator {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the simple calculator");

		System.out.print("Enter your first number: ");
		double num1 = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter your second number: ");
		double num2 = scanner.nextInt();
		scanner.nextLine();

		double add = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double multi = num1 * num2;
		
		System.out.println("Addition answer: "+add);
		System.out.println("Subtraction answer: "+sub);
		System.out.println("Division answer: "+div);
		System.out.println("Multiplication answer: "+multi);
	
	}
}
