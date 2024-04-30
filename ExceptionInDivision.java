package task_11_guvi;

import java.util.Scanner;

public class ExceptionInDivision {

	public static void main(String[] args) {
//		Getting inputs from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = input.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		/*
		 Any number divided by 0 returns ArithmeticException, so checking whether the Second input contains value 0, 
		 if it has then it throws the exception and which is handled by surrounding it with try catch block
		 */
		try {
			if(num2 == 0)
				throw new ArithmeticException();
			System.out.println(num1 / num2);
		}
		catch(ArithmeticException ae) {
			ae.getMessage();
			System.out.println("Cannot be Divided by Zero");
		}

	}

}
