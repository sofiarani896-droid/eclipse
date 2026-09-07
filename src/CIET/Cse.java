package CIET;

class Bankaccount{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	Bankaccount(String accountHolder,int accountNumber,double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount);
		}else
		{
			System.out.println("invalid amount");
		}
	}
	void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("invalid withdraml amount");
		}
		else if(amount<= balance) {
			balance=balance-amount;
			System.out.println("insufficient balance");
		}
	}
	void displayBalance() {
		System.out.println("/n---- Account holder details");
		System.out.println("Accaount holder");
		System.out.println("AccountNumber");
		System.out.println("balance");
		
	}
}
class Cse{
	public static void main(String[] args) {
		Bankaccount account = new Bankaccount("sofia", 12345678,6000);
		account.displayBalance();
		account.deposit(2000);
		account.displayBalance();
		account.withdraw(1500);
		account.displayBalance(); 
		account.withdraw(10000);
	}
}