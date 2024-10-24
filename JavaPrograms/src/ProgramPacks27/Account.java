package ProgramPacks27;

public class Account {

	private int accNo;
	private String name;
	private double balance;
	private Bank bank;
	
	public Account(int acc,String name,double balance,Bank bank)
	{
		
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}
	
	public Account(int accNo2,String name2,int balance2,BankImpl bank2) {
		
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]";
	}
	
	public void deposit(int i) {
		
	}
	
	public void withdraw(int i) {
		
	}
}
