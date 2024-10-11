package ProgramPack3;

import java.util.Scanner;

public class MathematicalOperation {

	public static void main(String[] args) {
		// This package is about mathematical operation
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition Operation");
		System.out.println("Enter your  values");
		int a, b;
		double ans;
		a = sc.nextInt();
		b = sc.nextInt();
		ans = a + b;
		System.out.println("Addition of the entered values  = " + ans);
		System.out.println("--------------------------------------------------------");
		System.out.println("Subraction Operation");
		// Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your values");
		int c, d;
		double ans1;
		c = sc.nextInt();
		d = sc.nextInt();
		ans1 = c - d;
		System.out.println("Subraction of the entered values = " + ans1);
		System.out.println("--------------------------------------------------------");
		System.out.println("Multiplication Operation");
		// Scanner sc2=new Scanner(System.in);
		System.out.println("Enter your  values");
		int e, f;
		double ans2;
		e = sc.nextInt();
		f = sc.nextInt();
		ans2 = e * f;
		System.out.println("Muktiplication of the entered values = " + ans2);
		System.out.println("---------------------------------------------------------");
		System.out.println("Division Operation");
		// Scanner sc3=new Scanner(System.in);
		System.out.println("Enter your values");
		int g, h;
		double ans3;
		g = sc.nextInt();
		h = sc.nextInt();
		ans3 = g / h;
		System.out.println("Divition of the entered values = " + ans3);
		System.out.println("----------------------------------------------------------");
		System.out.println("Modulus Operation");
		System.out.println("Enter your values");
		int r, p;
		double ans4;
		r = sc.nextInt();
		p = sc.nextInt();
		ans4 = r % p;
		System.out.println("Modullus of the entered values = " + ans4);
		System.out.println("----------------------------------------------------------");
		System.out.println("Post Increment Operation");
		System.out.println("Enter your values");
		int k;
		k = sc.nextInt();
		System.out.println("Post increment of the given value = " + (k++));
		System.out.println("----------------------------------------------------------");
		System.out.println("pre Increment opeeraton");
		System.out.println("Enter your value");
		int o;
		o = sc.nextInt();
		System.out.println("Pre increment of the given value = " + (++o));
		System.out.println("---------------------------------------------------------");
		System.out.println("Post Decrement Operation");
		System.out.println("Enter your value");
		int l;
		l = sc.nextInt();
		System.out.println("Post decrement of the given value = " + (l--));
		System.out.println("---------------------------------------------------------");
		System.out.println("Pre Decrement Operation");
		System.out.println("Enter your value");
		int q;
		q = sc.nextInt();
		System.out.println("Pre decrement of the given value = " + (--q));
		System.out.println("---------------------------------------------------------");
		System.out.println("***********Arithmatic Operstions completed***************");
		System.out.println("---------------------------------------------------------");

	}

}
