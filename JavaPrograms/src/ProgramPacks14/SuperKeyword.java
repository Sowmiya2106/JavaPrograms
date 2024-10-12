package ProgramPacks14;

class animal {
	int no = 1;

	animal(String name) {
		System.out.println(name);
	}

	void cheeta() {
		System.out.println("walkking");
	}
}

class lion extends animal {
	lion() {
		super("monkey");
		System.out.println("eating");
		super.cheeta();
		System.out.println(super.no);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion l1 = new lion();
	}

}
