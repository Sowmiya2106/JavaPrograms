package ProgramPack6;

import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Get array element from the user using scanner syntax data_type[] array_name =
		 * new data_type[size]
		 */
		System.out.println("Enter your 6 colours");
		Scanner scan = new Scanner(System.in);
		String[] colors = new String[6];
		colors[0] = scan.next();
		colors[1] = scan.next();
		colors[2] = scan.next();
		colors[3] = scan.next();
		colors[4] = scan.next();
		colors[5] = scan.next();
		System.out.println("The entered colour in 1st space = " + colors[0] + "\nThe entred colour in 2nd space = "
				+ colors[1] + "\nThe entered colour in 3rd space = " + colors[2]
				+ "\nThe entered colour in 4th space = " + colors[3] + "\nThe entered colour in 5th space = "
				+ colors[4] + "\nThe entered colour in 6th space = " + colors[5]);
	}
}