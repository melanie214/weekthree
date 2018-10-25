package weekthree;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name =""; 
		int choice = 0; 
		
		Scanner reader = new Scanner (System.in);
		
		String namePrompt =  "Please enter your name: "; 
		
		
		
		String[] choices = new String [] {"1) Door 1", "2) Door 2", "3) Door 3", "Exit App"}; 
		String[] opts = new String [] {"A new car", "A goldfish", "Nothing!", "Thanks for playing"};
		
		// these are our arrays, they store our info as long as its the same data type 
		
		Prnt(namePrompt); //needs to be inside main method 
		name = InStr();
		
		//while loops to repeat prompt 
		//IsValidIn method checks if input "name" is valid 
		while(!IsValidIn(name)) {
			Prnt(namePrompt);
			name = InStr();
			
			// repeat earlier method for "choice" 
			
			// while loop if they put the wrong info, keep repeating until input is true
		}
		
		while(!IsValidIn(choice)) {
		
		 Prnt("Hello " + name + "! Please choose an option below!");
		 // now we can just have it say prnt 
		 
		PrntArr(choices);
		
		choice = InInt(); }
		
		
		
		// takes in int choice and prints that element in array.
		 GetResult(choice, opts);
	
	
	
	}
	
		 
		 //main method ends here
	
	// now we are going to make a method
	
	public static void Prnt(String str ) { 
		System.out.println(str);
		
		// this is a method that does the print ln for you heres how it works, quicker way to print to console. 
		
		}
		//get used input string, validate input 
	
	public static String InStr() {
		Scanner reader = new Scanner (System.in);

		return reader.nextLine(); }
		
	
		
	public static int InInt() {
			Scanner reader = new Scanner (System.in);

			return reader.nextInt(); }
	
	
	public static boolean IsValidIn(String Input) {
	 if(Input.isEmpty() || Input == null) { 
		 	return false; 
	 }
	 		return true; }
	 		

	 public static boolean IsValidIn(int Input) {
	 		 if(Input <1)  { 
	 			 	return false; 
	 		 }
	 		 		return true; 
	
	}
	
	 public static void PrntArr(String[] arr) { 
		 for (int k = 0; k < arr.length; k++) {
			 Prnt(arr[k]);
		 }
	 }
	
	public static void GetResult(int input, String[] arr) { 
		Prnt(arr [input -1]);  { 
			
		}
		
	}
	
	}



