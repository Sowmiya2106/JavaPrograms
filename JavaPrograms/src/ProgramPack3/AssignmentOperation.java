package ProgramPack3;

import java.util.Scanner;

public class AssignmentOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your value");
		int a, b, c;
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("SIMPLE ASSIGNMENT");
		c = a;
		System.out.println("Answer = " + c);
		System.out.println("ADDITION ASSIGNMENT");
		a += b;
		System.out.println("Answer = " + a);
		System.out.println("SUBSTRACTION ASSIGNMENT");
		a -= b;
		System.out.println("Answer = " + a);
		System.out.println("MUKTIPLICATION ASSIGNMENT");
		a *= b;
		System.out.println("Answer = " + a);
		System.out.println("DIVIDION ASSIGNMENT");
		a /= b;
		System.out.println("Answer = " + a);
		System.out.println("MODULUS ASSIGNMENTY");
		a %= b;
		System.out.println("Answer = " + a);
		System.out.println("BITWISE AND ASSIGNMENT OPERATION");
		a &= 8;
		System.out.println("Amswer = " + a);
		System.out.println("BITWISE OR ASSINGNMENT OPERATION");
		a |= 7;
		System.out.println("Answer = " + a);
		System.out.println("BITWISE XOR ASSIGNMENT OPERATION");
		a ^= 2;
		System.out.println("Answer = " + a);

	}

}
