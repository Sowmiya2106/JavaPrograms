package ProgramPacks10;

public class ConstructorOverloading {
	ConstructorOverloading() {
		System.out.println("EMPTY CONSTRUCTOR");
		System.out.println("***********************************************");
	}

	ConstructorOverloading(int a) {
		System.out.println("SINGLE PARAMETER CONSTRUCTOR");
		System.out.println("number " + a);
		System.out.println("***********************************************");
	}

	ConstructorOverloading(int id, String name) {
		System.out.println("id number is " + id);
		System.out.println("name " + name);
		System.out.println("***********************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading ob = new ConstructorOverloading();
		ConstructorOverloading ob1 = new ConstructorOverloading(7);
		ConstructorOverloading ob2= new ConstructorOverloading(1212, "sham");
	}
}
