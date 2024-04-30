/*
Checked Exceptions:
	- Checked exceptions are exceptions that are checked at compile time. This means the compiler ensures that the code handles or declares them.
	- Checked exceptions are subclasses of the 'Exception' class (excluding 'RuntimeException' and its subclasses).
	- Examples of checked exceptions include 'IOException', 'SQLException', 'ClassNotFoundException', etc.

Unchecked Exceptions: 
	- Unchecked exceptions are exceptions that are not checked at compile time. They occur at runtime and are not required to be handled or declared. 
	- Unchecked exceptions are subclasses of 'RuntimeException' or 'Error'. 
	- Examples of unchecked exceptions include 'NullPointerException', 'ArrayIndexOutOfBoundsException', 'ArithmeticException', etc.
*/
package task_11_guvi;

import java.io.*;

public class CheckedAndUncheckedExceptions {
	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("file.txt"); // IOException
			BufferedReader reader = new BufferedReader(file);
			String line = reader.readLine();
			System.out.println(line);
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}
		/*
		 In the example above, 'FileReader' and 'BufferedReader' constructors throw 'IOException', 
		 so the code must handle it either by catching it or declaring it in the method signature.
		 */

		String str = null;
		System.out.println(str.length()); // NullPointerException
		/*
		 In the example above, 'str.length()' throws a 'NullPointerException' because 'str' is 'null'. 
		 Since 'NullPointerException' is an unchecked exception, the code does not need to handle or declare it. 
		 However, if not handled, it will result in a runtime error.
		 */
	}
	/*
	 In summary, checked exceptions are checked at compile time and must be handled or declared, 
	 while unchecked exceptions are not checked at compile time and do not need to be handled or declared.
	 */
}
