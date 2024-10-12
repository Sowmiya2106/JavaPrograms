package ProgramPacks11;

class animal {
	void eat() {
		System.out.println("this animal is eating");
	}
}

class dog extends animal {
	void bark() {
		System.out.println("barks");
	}
}

class cat extends dog {
	void walk() {
		System.out.println("i can walk ");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1 = new cat();
		c1.walk();
		c1.bark();
		c1.eat();
	}

}
