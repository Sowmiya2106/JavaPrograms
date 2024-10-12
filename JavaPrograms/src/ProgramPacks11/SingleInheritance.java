package ProgramPacks11;

class dad {// Super Class
	int money = 2000;

}

class son extends dad {// derived class

}

public class SingleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s1 = new son();
		;
		System.out.println(s1.money);

	}

}
