package ProgramPacks16;

import java.util.Scanner;

class InvalidAgeException extends Exception{
       public InvalidAgeException(String message) {
    	   super(message);
       }
	
}
class AgeValidator{
	void checkage(int age)
	{
		try {
		 if(age<0||age>150)
		 {
			 throw  new InvalidAgeException("age invalid");
		 }
		 else
		 {
			 System.out.println("valid");
		 }
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
public class CustomExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		AgeValidator a1=new AgeValidator();
		a1.checkage(age);

	}

}
