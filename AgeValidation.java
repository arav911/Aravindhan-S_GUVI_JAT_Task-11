package task_11_guvi;

import java.util.Scanner;

//Creating a customized exception by extending the class Exception as parent
class InvalidAgeException extends Exception {
	public String toString() {
		return "Age must be greater than 18";
	}
}

public class AgeValidation {

	public static void main(String[] args) {
//		Getting password input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int age = input.nextInt();

		/*
		 If the user provides age which is less than 18,  
		 then it throws the InvalidAgeException and which is handled by surrounding it with try catch block
		 */
		try {
			if (age < 18)
				throw new InvalidAgeException();
			else
				System.out.println(age + " is a Valid Age");
		} catch (InvalidAgeException iae) {
			iae.printStackTrace();
		}

	}

}
