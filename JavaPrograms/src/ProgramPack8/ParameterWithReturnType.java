package ProgramPack8;

public class ParameterWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = integerParameter(4, 9, 1);
		System.out.println(p);
		String n = stringParameter("hello java");
		System.out.println(n);
	}

	public static int integerParameter(int a, int b, int c) {
		return a + b + c;
	}

	public static String stringParameter(String name) {
		return name;
	}

}
