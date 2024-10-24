package ProgramPacks24;

import java.util.Date;

public class MultipleInheritanceEmployee {

	public static void main(String[] args) {
		
		Person p1 = new Person("athiran",456754323l,new Date(2000,12,2));
	    System.out.println(p1);
	    
	    p1 = new Employee("pratheep",4343212344l,new Date(199,06,03),"Sales",45000);
	    System.out.println(p1);
	    
	    p1 = new LevelOneEmployee("Mano",7897653422l,new Date(2001,23,04),"Account",85000,200,"Signing authority");
	    System.out.println(p1);
	}

}
