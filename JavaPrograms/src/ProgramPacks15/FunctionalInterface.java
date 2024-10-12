
package ProgramPacks15;

interface a{
	void display();
}

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj=new a() {
			public void display()
			{
			   System.out.println("This is functional intrface method ");	
			}
		};
		obj.display();
     }

}
