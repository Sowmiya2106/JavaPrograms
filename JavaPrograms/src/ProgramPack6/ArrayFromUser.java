package ProgramPack6;

import java.util.Scanner;

public class ArrayFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int i;
		int n = scan.nextInt();
		System.out.println("Enter " + n + " integers");
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Thw entered integer values are");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

}
