

import chapter07.exercise.문제풀이03.Customer;

public class Bank {

   private Customer[] customers;
   private int numberOfCustomers;

   public Bank() {

      
      Customer customers[] = new Customer[10];
      this.customers = customers;
   }

   public void addCustomer(Customer customer) {
         
	   // customers[numberOfCustomers++] = customer;
      customers[numberOfCustomers] = customer;
         numberOfCustomers++;
      

   }

   public int getNumberOfCustomers() {
      return numberOfCustomers;
   }
   
   public Customer[] getCustomers() {
      return customers;
   }
   
   public Customer getCustomer(int index) {
      return customers[index];  
   }

}
