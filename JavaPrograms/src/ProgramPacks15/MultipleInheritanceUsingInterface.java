package ProgramPacks15;

interface printable {
	void display();

}

interface showable {
	void display();

}

class intra implements printable, showable {

	@Override
	public void display() {
		System.out.println("class c");
	}

}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intra i1 = new intra();
		i1.display();
	}

}
