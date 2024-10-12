package ProgramPacks17;

import java.util.Scanner;

public class ThrowKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		try {
			if(age<18)
			{
				throw new ArithmeticException ("Your not eligible for voting...! you have to cross 18..!");
			}
			else
			{
				System.out.println("Conguratulations your eligible for voting");
			}
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e);
		}


	}

}
