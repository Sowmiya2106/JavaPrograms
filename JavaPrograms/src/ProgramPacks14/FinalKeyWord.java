package ProgramPacks14;

class a {
	final void disp() {
		System.out.println("class a");
	}
}

class b extends a {
	final void dis() {
		System.out.println("class b");
	}
}

public class FinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj = new b();
		obj.disp();
		obj.dis();

	}

}
