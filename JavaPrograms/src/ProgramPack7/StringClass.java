package ProgramPack7;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string is a type of character array
		String ch = "Core Java Programs \n";
		System.out.println(ch);
		System.out.println("----------------------|");
		int chlen = ch.length();
		System.out.println(chlen);
		System.out.println("----------------------|");
		String chlow = ch.toLowerCase();
		System.out.println(chlow);
		System.out.println("----------------------|");
		String chup = ch.toUpperCase();
		System.out.println(chup);
		System.out.println("----------------------|");
		String string_concatenation = "hello" + "java" + "programs";
		System.out.println(string_concatenation);
		System.out.println("----------------------|");
		System.out.println(ch.replace('a', 'e'));
		System.out.println("----------------------|");
		System.out.println(ch.indexOf('o'));
		System.out.println("----------------------|");
		System.out.println(ch.lastIndexOf(string_concatenation));
		System.out.println("----------------------|");
		System.out.println(ch.repeat(2));
		System.out.println("----------------------|");
	}

}
