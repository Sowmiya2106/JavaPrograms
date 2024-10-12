package ProgramPacks14;

import java.util.Scanner;

public class FinallyKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int err=0;
		System.out.println("enter the value");
		try {
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			System.out.println("enter the divisible value");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			err=0;
		}
		catch(Exception e)
		{
			err=1;
		}
		finally {
			if(err==1)
			{
				System.out.println("Error found");
			}
			else {
				System.out.println("Error not found");
			}
			
		}

	}

}
