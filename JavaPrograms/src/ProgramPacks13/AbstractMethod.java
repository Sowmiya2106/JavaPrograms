package ProgramPacks13;

abstract class laptop {
	abstract void start();

	void amount() {
		System.out.println("Laptop");
		System.out.println(50000);
	}
}

class model extends laptop {
	void start() {
		System.out.println("asus");
	}

}

//------------------------------------------------------
public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model e1 = new model();
		e1.amount();
		e1.start();
	}

}
