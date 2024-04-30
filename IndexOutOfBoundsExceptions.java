package task_11_guvi;

import java.util.Scanner;

public class IndexOutOfBoundsExceptions {

	public static void main(String[] args) {
//		Declaring an integer Array with length of 5
		int[] intArr = {1, 2, 3, 4, 5};
		
//		getting String and index inputs from the user 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = input.nextLine();
		System.out.print("Enter the index number: ");
		int index = input.nextInt();
		
		/*
		 If the user tries to access the index of an array which is greater than its length,  
		 then it throws the ArrayIndexOutOfBoundsException and which is handled by surrounding it with try catch block
		 */
		try {
			System.out.println(intArr[index]);
		} catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}
		
		/*
		 If the user tries to access the index of a String which is greater than its length,  
		 then it throws the StringIndexOutOfBoundsException and which is handled by surrounding it with try catch block
		 */
		try {
			System.out.println(str.charAt(index));
		} catch(StringIndexOutOfBoundsException sie) {
			sie.printStackTrace();
		}

	}

}
