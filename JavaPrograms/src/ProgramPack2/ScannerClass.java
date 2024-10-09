package ProgramPack2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This Scanner class helps to get input from the user
		// using "+"symbol is defined as concatenation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the byte value");
		byte ByteValue = scan.nextByte();
		System.out.println("The entered byte value is = " + ByteValue);
		System.out.println("**********************************************************************");
		System.out.println("Enter the short value");
		short ShortValue = scan.nextShort();
		System.out.println("The entered short value is = " + ShortValue);
		System.out.println("**********************************************************************");
		System.out.println("Enter the integer value");
		int IntValue = scan.nextInt();
		System.out.println("The entered integer value is = " + IntValue);
		System.out.println("**********************************************************************");
		System.out.println("Enter the long value");
		long LongValue = scan.nextLong();
		System.out.println("The entered long value is = " + LongValue);
		System.out.println("**********************************************************************");
		System.out.println("Enter the float value");
		float FloatValue = scan.nextFloat();
		System.out.println("The entered float value is = " + FloatValue);
		System.out.println("**********************************************************************");
		System.out.println("Enter the boolean value");
		boolean BooleanValue = scan.nextBoolean();
		System.out.println("The entered boolean valie is = " + BooleanValue);
		System.out.println("**********************************************************************");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your Print line ");
		String line = scan1.nextLine();
		System.out.println("PrintLine" + line);
		System.out.println("______________________________________________________________________");

	}

}
