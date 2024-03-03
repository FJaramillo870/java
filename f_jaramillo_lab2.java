/*Assignment 2:
As activity directory at Lake Taos, it is your job 
to suggest appropriate activities to guests based on 
the weather:
temp >= 80: swimming
60 <= temp < 80: tennis
40 <= temp < 60: golf
temp < 40: skiing
Write a program that prompts the user for a 
temperature, then prints out the activity appropriate 
for that temperature. You can use any combination of 
if, switch statements, and logic gates. Be sure that 
your conditions are no more complex than necessary.

Extra credit:
Modify your program so that if the temperature is 
greater than 95 or less than 20, it prints "Visit our 
shops!
*/

import java.util.Scanner;

public class F_Jaramillo_lab2 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int temp;
		System.out.println("What is the temperature today? ");
		temp = scanner.nextInt();

		if(temp>95) {
			System.out.println("check out our stores!");
		}
		else if(temp>=80 && temp<95) {
			System.out.println("Let's go swimming!");
		}
		else if(temp >= 60 && temp<80) {
			System.out.println("Let's play tennis!");
		}
		else if(temp >= 40 && temp<60) {
			System.out.println("Let's play golf!");
		}
		else if(temp < 40 && temp >= 20)  {
			System.out.println("Let's go skiing!");
		}
		else if(temp < 20) {
			System.out.println("Check out our stores!");
		}

	}
}
