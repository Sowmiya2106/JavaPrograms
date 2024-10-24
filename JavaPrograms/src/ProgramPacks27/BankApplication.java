package ProgramPacks27;

public class BankApplication {
	
	public static void main(String[] args) {
		
	   BankImpl bank = new BankImpl();
	   Account account = new Account(23432,"Arun",155000,bank);
	   System.out.println();
	   
	   account.deposit(15000);
	   System.out.println(account);
	   
	   account.withdraw(3000);
	   System.out.println(account);
	}

}
