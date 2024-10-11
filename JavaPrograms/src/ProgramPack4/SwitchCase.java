package ProgramPack4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SWTICH CASE");
		Scanner u = new Scanner(System.in);
		System.out.println("Enter the number");
		int i;
		i = u.nextInt();
		switch (i) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("unavailable please enter the number below the seven");
		}

	}

}
