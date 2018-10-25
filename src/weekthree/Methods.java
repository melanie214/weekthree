package weekthree;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// method is a collection of statements that perform some specific tasks and return the result to the caller. 
	// a method can perform some specific tasks without returning anything. Methods allow to us to reuse code without retyping
	// code. Methods are time savers. 
	
	
	// methods are a mini program within the program and when you want to reuse that snippet 
	// of code you can just enter the name and it will insert the code without having rewrite all of it. 
	
	String firstName = "Bob"; 
	String lastName = "Ross"; 
	String fullName = createFullname(firstName, lastName);   
	
	System.out.println(fullName);
	}
	
	public static String createFullname(String x, String y) {
		//this is called a method signature 
		// String is what type of data this method is supposed to return
		// not all methods have return something they just do something; if thats the case the data type is void
		// next is name of method, you want to give it a name that is a verb that makes sense because it should explain
		// what the method does 
		// the parenthesis are parameters 
		
		 return x + " " + y ; 
		 
	
		 
		 
		 
		 
		 }
		 
		 
		 
		 
		 
		 
		 
			 
			 
		 
		
		 
		
		
		
		
		
		
		
	}

	
