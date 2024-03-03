//Felix Jaramillo
//Java programming
//Lab3
/*
Write a Java program that allows users to perform various operations on a given string. The program should prompt the user to enter a word and then display a menu of options for string manipulation. After performing the chosen operation, the program should terminate.

Requirements:
*Create a user-chosen integer called choice, which will be used to choose the
 string operation in the so-called menu.
*Use either if-conditions or switch statements to create the menu together with
 the choice variable.
*Implement the following functionalities:
    *Get the length of the entered word.
    *Convert the entered word to all uppercase.
    *Convert the entered word to all lowercase.
    *Check if another string is equal to the entered word (ignoring case).
*Display appropriate messages for each operation.
*Handle user input validation.
*Ensure the program terminates gracefully after executing the chosen operation.

Extra credit:
*Use the while loop to create a program that would only end, when the user 
chooses to. 
*/
import java.util.Scanner;

public class lab3{
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Choose a word: ");
		String word = scanner.nextLine(); 
		System.out.println("Your chosen word is: "+word);


		System.out.println("Choose from these options: ");
		System.out.println("1) Get the length of your word.");
		System.out.println("2) Turn your string to all uppercase.");
		System.out.println("3) Turn your string to all lowercase.");
		System.out.println("4) Check is another string is equal to your word.");
		int choice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Your choice: "+choice);

		if(choice==1){
			int length = word.length();
			System.out.println("The length of your word is: "+ length);
			System.out.println("Exiting the program... have a great day!");
		}

		else if(choice==2){
			String upper = word.toUpperCase();
			System.out.println("Your word converted to Upper case: "+ upper);
			System.out.println("Exiting the program... have a great day!");
		}
		else if(choice==3){
			String lower = word.toLowerCase();
			System.out.println("Your word converted to lower case: "+ lower);
			System.out.println("Exiting the program... have a great day!");
		}
		else if(choice==4){
			System.out.print("Enter another word to compare your first one to: ");
			String word2 = scanner.nextLine();
			System.out.println("Your chosen word is : "+word2 );
			Boolean check = word.equals(word2);
			if(check == true){
				System.out.println("Your words are the same!");
				System.out.println("Exiting the program... have a great day!");
			}
			else{
				System.out.println("Your words are not the same.");
				System.out.println("Exiting the program... have a great day!");
			}
		}
		else{
			System.out.println("Wrong choice please re-run the program");
			System.out.println("Exiting the program... have a great day!");
		}
	}
}
