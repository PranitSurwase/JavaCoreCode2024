package Basics_Core_java;

public class Parent_Inheritance_test {
	Parent_Inheritance_test() {
		calculate();
		System.out.println("Empty parent ctor.");
	}

	void calculate() {
		System.out.println("Parent calculating...");
	}
}

 class Child extends Parent_Inheritance_test {
	Child() {
		System.out.println("Empty child ctor.");
	}

	@Override
	void calculate() {
		System.out.println("Child calculating...");
	}
}

