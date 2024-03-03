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