package ProgramPacks14;

public class ThisKeyWord {

	String myname;

	// constructor
	ThisKeyWord() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}

	// method
	public void team(String myname) {
		// myname=myname;
		this.myname = myname;
	}

	public static void main(String[] args) {
		ThisKeyWord n = new ThisKeyWord();
		n.team("mark");
		System.out.println(n.myname);

	}

}
