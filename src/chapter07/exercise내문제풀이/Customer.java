package chapter07.exercise내문제풀이;

public class Customer {

	private String firstName;
	private String lastName;
	private BankAccount account;

	// 생성자
	Customer(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
			
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		
		return("고객이름 : " +firstName + lastName +"\n잔액 : " +account);
		
		

	}
}
