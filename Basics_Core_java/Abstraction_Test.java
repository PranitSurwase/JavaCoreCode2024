package Basics_Core_java;

public abstract class Abstraction_Test {
	
	public  static void display() {
		System.out.println("this from abstract class");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstraction_Test ab=new Abstraction_Test(); //compile time error 
		                                                 // cannot instantiate abstract class;
		//ab.display();
		Abstraction_Test.display();
		

	}

}
