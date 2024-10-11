package ProgramPack5;

import java.util.Scanner;

public class Factorial_Scanner {

	public static void main(String[] args) {
		Scanner f1 = new Scanner(System.in);
		int fact, no;
		System.out.println("Enter the intial number for factorial");
		fact = f1.nextInt();
		System.out.println("Enter till the value you need the factorial");
		no = f1.nextInt();
		for (int i = fact; i <= no; i++) {
			fact *= i;
			System.out.println(i + "Factorial" + fact);
		}
	}
}