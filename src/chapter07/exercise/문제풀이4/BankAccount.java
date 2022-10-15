

import chapter07.exercise.문제풀이03.BankAccount;

public class BankAccount {
	   
	   private int balance; //잔액
	   
	   
	   public BankAccount(int balance) {
	   this.balance = balance;   
	   }
	   
	   public int getBalance() {
	   return balance;   
	   }
	   
	   
	   
	   // 입금메소드
	   public void deposit(int amount) {
	      this.balance = balance + amount;
	      // this.balance += amount; int이므로 21억밖에안됨
	   }
	   //출금메소드  amount : 출금금액
	   public boolean withdraw(int amount) {
	      if(this.balance >= amount) {
	         this.balance = this.balance - amount;
	         System.out.println("출금되었습니다.");
	         return true;
	         
	      }
	      else {
	         System.out.println("출금불가.");
	         return false;
	      }
	      
	   }
	   
	   /*
	    * 이체 
	    * amount : 금액
	    * otherAccount : 계좌번호
	    * 
	    * 
	    */
	   
	   boolean transfer(int amount , BankAccount otherAccount) {
	      /*
	       * withdraw(amount){
	       *  otherAccount.deposit(amount);
	       *  return true;
	       * }
	       * 
	       * return false;
	       * 
	       * 
	       */
	      balance -= amount;
	      
	      otherAccount.balance+=amount;
	      
	      return true;
	   }
	   
	   
	   

	}