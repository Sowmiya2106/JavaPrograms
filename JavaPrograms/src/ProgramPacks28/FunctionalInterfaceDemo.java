package ProgramPacks28;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
	
		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		//Using Lambda Expression
        GreetInterface g1 = () ->{
        	return "Java Programs";
        };
        
        System.out.println(g1.greet());
	}

}
