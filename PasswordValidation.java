package task_11_guvi;

import java.util.Scanner;

//Creating a customized exception by extending the class Exception as parent
class InvalidPasswordException extends Exception {
	public String toString() {
		return "Invalid Password!!!";
	}
}

public class PasswordValidation {

	public static void main(String[] args) {
//		Assigning User ID and Password with static value
		String userID = "Aravindhan_S";
		String password = "abcd1234";

//		Getting password input from user
		Scanner input = new Scanner(System.in);
		System.out.print("User ID: " + userID + " \nEnter the Password: ");
		String pwd = input.nextLine();

		/*
		 If the user provides Password which is not equals to the password specified in the program,  
		 then it throws the InvalidPasswordException, else the Login will be successful and which is handled by surrounding it with try catch block
		 */		
		try {
			if (pwd.equals(password))
				System.out.println("Login Successful!!!");
			else
				throw new InvalidPasswordException();
		} catch (InvalidPasswordException ipe) {
			ipe.printStackTrace();
		}

	}

}
