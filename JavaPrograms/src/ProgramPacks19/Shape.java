//Program to define abstract class
package ProgramPacks19;
//abstract class
public abstract class Shape {
      protected float area;
      
      //abstract method
      abstract void callArea();
      
      //concrete method
      void show() {
           System.out.println("Area of shape is"+area);
	}
		
}

