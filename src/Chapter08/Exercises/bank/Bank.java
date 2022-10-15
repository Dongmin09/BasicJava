package Chapter08.Exercises.bank;

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
