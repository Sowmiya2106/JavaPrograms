package ProgramPack4;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculating greatest number in three values
		System.out.println("IF ELSEIF STATEMENT");
		Scanner o = new Scanner(System.in);
		System.out.println("Enter your values");
		int r, s, t;
		r = o.nextInt();
		s = o.nextInt();
		t = o.nextInt();
		if (r > s && r > t) {
			System.out.println("The greatest value = " + r);
		} else if (s > t) {
			System.out.println("The greatest value = " + s);
		} else {
			System.out.println("The greatest value = " + t);
		}

	}

}
