package Basics_Core_java;

public class SicBlocks {
	public SicBlocks() {
		System.out.println("in Constructor");
	}

	public static void main(String[] args) {
		SicBlocks s=new SicBlocks();
//		SicBlocks.display();
//		s.display();
//		s.printWords();

	}

	
	
	static 
	{
		System.out.println("Static block");
	}
	
	public static void display() 
	{
		
		System.out.println("Static method");
		
		
	}
	public void printWords() 
	{
	System.out.println("in normal method");	
		
		
	}
	
	
	
}
