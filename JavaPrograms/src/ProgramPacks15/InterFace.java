package ProgramPacks15;

interface animal {
	int mark = 20;

	void sound();
}

class cat implements animal {
	public void sound() {
		System.out.println("my cat");
	}
}

public class InterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1 = new cat();
		c1.sound();

	}

}
