package banksystem;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	private String firstName;
	private String lastName;
	private static int count = 1;
	private int customerID;
	
	
	public BankCustomer(String theFirstName, String theLastName) {
		setFirstName(theFirstName);
		setLastName(theLastName);
		customerID = count++;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	
	
	
	List<BankAccount> accountList = new ArrayList<BankAccount>();
	
	
	
	public void addAccount(BankAccount accountName) {
		accountList.add(accountName);
	}
	
	public void removeAccount(String accountNumber) {
		accountList.removeIf(account -> account.getAccountNumber().equals(accountNumber));
	}
	
	public void listAccounts() {
		System.out.println("Accounts held by customer ID " + this.getCustomerID());
		for (BankAccount account:accountList) {
			System.out.println(account.getAccountID());
		}
	}
	
	public void listAccountOverviews() {
		System.out.println("Account overview for customer ID " + this.getCustomerID());
		for (BankAccount account:accountList) {
			account.accountOverview();
		}
	}
	
	
	public void tickInterest() {
		for (BankAccount account:accountList) {
			account.tickInterest();		
	}
	
	}
}
