package weekthree;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String studentName1 = "Melanie Lund";
	String studentName2 = "Missi Spangler";
	String studentName3 = "Phil Everhard";
	
	System.out.println(studentName1);
	System.out.println(studentName2);
	System.out.println(studentName3);
	
	// example of an array 
	
	String[] students = new String[3]; 
	
	//use square brackets, it tells java you are going to make an array vs a variable. you need to 
	// put a number in the array to tell how many values are going to stored
	// computers love to start counting at zero
	
	students[0] = "Melanie Lund";
	students[1] = "Missi Spangler";
	students[2] = "Phil Everhard";
	
	System.out.println(students[0]);
	System.out.println(students[1]);
	System.out.println(students[2]);
	
	for (int i = 0; i < students.length; i ++) {
		System.out.println(students[i]);
		
	}
	
	for (String student : students) {
			System.out.println(student);
	}
	
	// arrays can store many values of the same data type
	
	{
		
	int bucky[]= {2,4,5,8,3};
	
	//array initializer int then variable name, then data, then you can choose to print whichever value you want 
	
	
	System.out.println(bucky[2]);
	
	}
	
	{ String[] products = new String[6];
	
		products[0] = "Yams";
		products[1] = "Lambs";
		products[2] = "Potatoes";
		products[3] = "Beans";
		products[4] = "Greens";
		products[5] = "You name it!!";
		
		for (String product : products) { 
				System.out.println("Product: " + product);
				
				
			int i = 0;
				 while (i < 10) {
					 System.out.println(i); }
				 
				
		}
		
		





		
	}
	
	
	
	
	



	
	
	
	
	
	
	}
}
