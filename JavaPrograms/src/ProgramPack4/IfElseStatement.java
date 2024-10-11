package ProgramPack4;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		;
		// TODO Auto-generated method stub
		System.out.println("IF ELSE STATEMENT");
		System.out.println("Eneter rain or not");
		Scanner q = new Scanner(System.in);
		String p, rain = null;
		p = q.nextLine();
		if (p == rain) {
			System.out.println("Today holiday");
		} else {
			System.out.println("Today Working day");
		}
	}
}
