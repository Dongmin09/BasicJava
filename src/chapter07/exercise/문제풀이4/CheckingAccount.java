package chapter07.exercise.문제풀이4;


public class CheckingAccount extends BankAccount{
	
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		
		super(balance);
		this.protectedBy = protectedBy;
		
		
		// SavingAccount - (amount - CheckingAccount);
	}
	
	
	
	//잔액
	
	
	public boolean withdraw(int amount) {
		
		return super.withdraw(amount){
			
			
			return true;
			
		}
		
		
		
		else {
			this.balance =0;
			protectedBy.balance -= amount - this.getBalance();
			
		}
		
	}
	
	
}

