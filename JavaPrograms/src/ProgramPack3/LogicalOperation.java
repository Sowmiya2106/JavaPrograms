package ProgramPack3;

import java.util.Scanner;

public class LogicalOperation {

	public static void main(String[] args) {
		// Logical Operation
		Scanner s = new Scanner(System.in);
		System.out.println("AND OPERATION");
		System.out.println("Enter your boolean values");
		boolean a, b;
		a = s.nextBoolean();
		b = s.nextBoolean();
		System.out.println("Result = " + (a && b));
		System.out.println("==================================================================");
		System.out.println("OR OPERATION");
		System.out.println("Enter your boolean values");
		boolean x, y;
		x = s.nextBoolean();
		y = s.nextBoolean();
		System.out.println("Result = " + (x || y));
		System.out.println("==================================================================");
		System.out.println("NOT OPERATION");
		boolean m;
		m = s.nextBoolean();
		System.out.println("Result = " + (!a));
		System.out.println("==================================================================");
		System.out.println("-------------------lOGICAL OPERSTION COMPLETED--------------------");
		System.out.println("==================================================================");
	}

}
