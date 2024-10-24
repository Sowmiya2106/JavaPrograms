//Program to demonstrate Overloading - compile time polumorhism
package ProgramPacks20;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("------------------------ Constructor Overloading -----------------------");

		Point p = new Point();//Default constructor invoked
		System.out.println(p);
		
		Point p1 = new Point(14.5f);//Single parameter constructor
		System.out.println(p1);
		
		Point p2 = new Point(23f);//Two parameter constructor
		System.out.println(p2);
		
		System.out.println("------------------------ Method Overloading -----------------------");
		System.out.println("Addition of two integers : " + MethodOverLoading.addition(10, 20));
		System.out.println("Addition of two floating numbers :" + MethodOverLoading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + MethodOverLoading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverLoading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + MethodOverLoading.addition("Hello ", "World"));
	}

}
