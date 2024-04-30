/*
Exceptions:
   - Exceptions represent conditions that occur because of bad input, invalid operations, or other unforeseeable circumstances during the execution of a program. 
   - They are recoverable.
   - Exceptions are subclasses of the 'Exception' class.
   - Examples of exceptions include 'NullPointerException', 'ArrayIndexOutOfBoundsException', 'FileNotFoundException', etc.
Errors: 
   - Errors, represent serious problems that should not be caught or handled by regular program logic. 
   - They are typically caused by external factors beyond the control of the program. 
   - Errors are subclasses of the 'Error' class. 
   - Examples of errors include 'OutOfMemoryError', 'StackOverflowError', etc.
*/
package task_11_guvi;

   public class ExceptionsAndErrors {
       public static void main(String[] args) {
			/*
			 'ArrayIndexOutOfBoundsException' is an exception that occurs due to attempting to access an invalid index in an array. 
			 It is caught and handled within a 'try-catch' block.
			 */   	   
           try {
               int[] arr = new int[5];
               System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Array index out of bounds!");
           }
           
			/* 
			 'StackOverflowError' is an error that occurs when the stack size of a thread is exceeded due to excessive recursion or deep method calls. 
			 Errors like these are not typically caught and handled by regular program logic, as they indicate serious problems that should be addressed 
			 at a higher level, such as by adjusting JVM settings or redesigning the application architecture.
			 */
           try {
               throw new StackOverflowError();
           } catch (StackOverflowError e) {
               System.out.println("Stack overflow occurred!");
           }
       }
   }