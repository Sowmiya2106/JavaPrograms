package ProgramPacks27;

public class BankImpl {
	
	public void deposit(Account account,double amount,double DEPOSIT_LIMIT)
	{
		if(amount > DEPOSIT_LIMIT)
			
			System.err.println("Deposit not possible...exceeds Deposite Limit");
	
		else
			
			account.setBalance(account.getBalance()+amount);
		    System.out.println("Deposited" + amount + "Into Account:" + account.getAccNo());
	}
	
	public void withdraw(Account account,double amount,int MIN_BALANCE)
	{
		if(account.getBalance() - amount >= MIN_BALANCE)
		{
			account.setBalance(account.getBalance() - amount);
			System.out.println("Withdrawn" +amount+ "From account:" +account.getAccNo());
        }
		else
		{
			System.out.println("Insufficient balance in Account : " + account.getAccNo());
		}
	}
}
