/*What are the four Access Modifiers available in Java, and what is their significance in terms of class, method and variable accessibility?
	Answer: 
	In Java, there are four access modifiers: 
		- Private: Limits the access to the member within the same class.
		- Default (no modifier): Allows access to the member within the same package.
		- Protected: Grants access to the member within the same package and to subclasses (even if they are in different packages).
		- Public: Provides unrestricted access from any other class.
	These modifiers control the accessibility of classes, methods, and variables, ensuring encapsulation and proper access control within Java programs.

Example:*/
package task_11_guvi;// Define a package

// Class with default access modifier
class DefaultClass {
	void defaultMethod() {
		System.out.println("This is a default method");
	}
}

public class AccessModifiers {
	// Private variable   
	private int privateVar = 10;

	// Protected method   
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}

	// Public method   
	public void publicMethod() {
		System.out.println("This is a public method");
	}

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers();
		// Accessing public method       
		obj.publicMethod();
		// Accessing private variable (not allowed)       
		// System.out.println(obj.privateVar); // This would give an error
		// Accessing protected method (not allowed because main method is not in a
		// subclass)       
		// obj.protectedMethod(); // This would give an error
		// Accessing default method from different package (not allowed)       
		// DefaultClass defaultObj = new DefaultClass(); // This would give an error
	}
}
/*
 * Explanation: 
   - The 'DefaultClass' has default access, meaning it can be accessed within the same package. 
   - 'AccessModifiersExample' has public access, allowing it to be accessed from any other class. 
   - The 'privateVar' variable is private and can only be accessed within the same class. 
   - The 'protectedMethod' is protected, allowing access within the same package and by subclasses. 
   - The 'publicMethod' is public and can be accessed from any other class. 
   - In the 'main' method, you can see examples of accessing public members and how attempts to access private, protected, and default members
   		from outside their allowed scope result in compilation errors.
 */