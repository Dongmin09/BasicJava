package chapter07.exercise.문제풀이03;

public class Customer {
	   
	   private String firstName;
	   private String lastName;
	   private BankAccount account;
	   
	   public Customer(String firstName , String lastName) {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      
	   }
	   
	   public String getFirstName() {
	   return  firstName;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public BankAccount getAccount() {
	      return account;
	   }
	   
	   
	   public void setAccount( BankAccount account) {
	      this.account = account;
	      
	      
	   }
	   
	   public String toString() {
	      return ("고객이름 : "+firstName + lastName + "\n잔액 : " + account.getBalance());
	      
	      /*
	       * return String.format("이름 %s %s", 잔고 ㅣ %, d원", firstName, lastName, account.getBalance());
	       * 
	       * 
	       * 
	       */
	      
	      
	   }
	   
	   

	}