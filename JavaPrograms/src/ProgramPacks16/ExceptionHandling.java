package ProgramPacks16;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		   System.out.println("Enter your value");
	       Scanner scan=new Scanner(System.in);
	       
	       try {
	    	   int a = scan.nextInt();
	       }
	       catch(Exception ex) {
	    	   System.out.println(ex);
	       }
	       System.out.println("Program ended");
	}

}
