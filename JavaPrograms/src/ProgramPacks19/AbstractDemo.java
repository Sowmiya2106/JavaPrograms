package ProgramPacks19;

public class AbstractDemo {

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.callArea();
		sq.show();
		r1.callArea();
		r1.show();
		
		System.out.println("-----------------------------------------------");
	    //Runtime Polymorphism / Dynamic binding / late binding
		//ex: method Overriding
		
		Shape shape;
		shape =  new Square(12.5f);
		
		shape.callArea(); //invoked square class calArea()
		shape.show();
		
		shape = new Rectangle(10,20);
		
		shape.callArea(); //invoked rectangle class calArea()
		shape.show();
     }
}
