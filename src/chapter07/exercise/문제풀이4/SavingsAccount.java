package chapter07.exercise.문제풀이4;

public class SavingsAccount extends BankAccount {

	private double interestRate;
	
	
	public void SavingsAccount(int balance, double interestRate) {
	
		
		
		/*
		 * super(balance);
		 * this.interestRate = interestRate;
		 * 
		 * 
		 * 
		 */
	this.interestRate = interestRate;
	this.balance = balance;
	this.SavingsAccount = SavingsAccount;
		
	}
	
	
	
	void updateBalance(int period) {
		
		
		/*
		 * 
		 * this.balance += this.balance*interestRate*period;
		 * 
		 */
		this.balance =balance;
		
		
		
	}
	
	
	
	
	
	
	
}
