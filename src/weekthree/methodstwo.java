package weekthree;

public class methodstwo {
	
	public static void main(String[] args) {
		
		 int[] myArray = new int [3]; 
		 myArray[0] = 7; 
		 myArray[1] = 10; 
		 myArray[2] = 8; 
		 
		 
		 int sum = sumArray(myArray);
		 System.out.println(sum);
		 
		 }
		 
		 // takes an array of ints and returns the sum of all ints 
		 
		 public static int sumArray(int[] numbers) {
			 int sum = 0; 
			 for (int number : numbers) {
				 sum += number; 
				 
			 }
			 
			 return sum; 
	}

}
