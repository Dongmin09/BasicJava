package chapter07.exercise내문제풀이;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;

	public Bank() {

		Customer coustomers[] = new Customer[10];
		this.customers = customers;

	}

	public void addCustomer(Customer customer) {

		customers[numberOfCustomers] = customer;
		numberOfCustomers++;

	}

	public int getNumberOfCustomers() {

		return numberOfCustomers;
	}

	public Customer[] getCoustomers() {
		return customers;
	}

	public Customer getCoustomer(int index) {
		return customers[index];
	}

}
