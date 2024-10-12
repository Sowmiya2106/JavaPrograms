package ProgramPack8;

public class PassingParametersWithoutReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringParameter("maha");
		stringParameter("bava");
		stringParameter("sabar");
		stringParameter("sago");
		stringParameter("shanmuga");
		integerParameter(3, 4, 1);
	}

	public static void stringParameter(String name) {
		System.out.println("hello " + name);
		System.out.println("-------------------------------------------");
	}

	public static void integerParameter(int x, int y, int z) {
		System.out.println("Addition of two parameters = " + (x + y + z));
		System.out.println("-------------------------------------------");
		System.out.println("Subraction of two two parameters = " + (x - y - z));
		System.out.println("-------------------------------------------");
		System.out.println("Multhiplication of two parameters = " + (x * y * z));
		System.out.println("-------------------------------------------");
	}
}
