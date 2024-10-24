package ProgramPacks18;

class A extends Thread{
      public void run() {
    	  
    	  for(int i=0;i<10;i++) 
          {
    	     System.out.println("Thread");
    	     try {
  			   Thread.sleep(10);
  		   }
  		   catch (InterruptedException e) {
  			   System.out.println(e);
  		   }
        }
      }
}

class B extends Thread{
	public void run() {
		
		for(int i = 0;i<10;i++) 
		{
		   System.out.println("Method");
		   try {
			   Thread.sleep(10);
		   }
		   catch (InterruptedException e) {
			   System.out.println(e);
		   }
	    }
    }
}
public class Threading {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		
		a1.start();
		b1.start();
	
	}

}
