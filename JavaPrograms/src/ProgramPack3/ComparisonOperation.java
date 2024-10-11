package ProgramPack3;

import java.util.Scanner;

public class ComparisonOperation {

	public static void main(String[] args) {
		/*
		 * Comparison operation equals to (==) not equals to(!=) greater than(>) less
		 * than (<) greater than or equal to(>=) less than or equal to(<=)
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("--------------EQUALS TO OPERATION (==)----------------");
		System.out.println("Enter the values");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("Result = " + (x == y));
		System.out.println("-------------NOT EQUALS TO OPERATION (!=)-------------");
		System.out.println("Enter the values");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Result = " + (a != b));
		System.out.println("-----------------GREATER THAN (>)---------------------");
		System.out.println("Enter the values");
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println("Result = " + (m > n));
		System.out.println("-----------------LESSER THAN (<)----------------------");
		System.out.println("Enter the values");
		int p = s.nextInt();
		int r = s.nextInt();
		System.out.println("Result = " + (p < r));
		System.out.println("------------GREATER THAN OR EQUALS TO (>=)------------");
		System.out.println("Enter the values");
		int o = s.nextInt();
		int q = s.nextInt();
		System.out.println("Result = " + (o >= q));
		System.out.println("------------LESSER THAN OR EQUALS TO (<=)-------------");
		System.out.println("Enter the values");
		int g = s.nextInt();
		int h = s.nextInt();
		System.out.println("Result = " + (g <= h));
	}

}
