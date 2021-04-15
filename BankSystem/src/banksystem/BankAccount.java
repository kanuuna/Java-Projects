package banksystem;

public abstract class BankAccount {
	private double balance;
	private String sortCode;
	private String accountNumber;
	private static int accountCount = 1;
	private int accountID;
	private double interestRate;
	
	
	public BankAccount(double theBalance, String theSortCode, String theAccountNumber, double theInterestRate) {
		setBalance(theBalance);
		setSortCode(theSortCode);
		setAccountNumber(theAccountNumber);
		accountID = accountCount++;
		setInterestRate(theInterestRate);
	}
	
	public BankAccount(double theBalance, String theSortCode, String theAccountNumber) {
		setBalance(theBalance);
		setSortCode(theSortCode);
		setAccountNumber(theAccountNumber);
		accountID = accountCount++;
		setInterestRate(0);
	}
	
	
	
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String sortCode) {
		if (sortCode.length() == 6) {
			this.sortCode = sortCode;
		} else {
			System.out.println("Could not create account. Enter a valid 6-digit sort code.");
		}
		
		
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		if (accountNumber.length() == 8) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("Could not create account. Enter a valid 8-digit account number.");
		}
		
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void makeDeposit(double deposit) {
		double currentBalance = this.getBalance();
		currentBalance += deposit;
		this.setBalance(currentBalance);
		System.out.println("Deposit of " + deposit + " successful.\nAccount balance is now: " + currentBalance);
	}
	
	public void makeWithdrawal(double withdrawal) {
		double currentBalance = this.getBalance();
		
		if (currentBalance - withdrawal > 0) {
		currentBalance -= withdrawal;
		this.setBalance(currentBalance);
		System.out.println("Withdrawal of " + withdrawal + " successful.\nAccount balance is now: " + currentBalance);
		} else {
			System.out.println("Cannot withdraw more than balance.");
			
		}
		
		
		
	}
	
	public void tickInterest() {
		double currentBalance = this.getBalance();
		double interestRate = this.getInterestRate() * 0.01;
		double balanceChange = 0;
		balanceChange = interestRate * currentBalance;
		currentBalance += balanceChange;
		System.out.println("\n\nInterest payment for account ID: " + this.getAccountID());
		System.out.println("Interest paid: " + balanceChange);
		System.out.println("Updated balance: " + currentBalance);
		this.setBalance(currentBalance);
	}
	
	public void changeInterest(double rateChange) {
		this.setInterestRate(rateChange);
		System.out.println("\n\nInterest rate for account ID " + this.getAccountID() + " has been changed to " + this.getInterestRate() + "%");
	}
	
	public void accountOverview() {
		System.out.println("\n\nUnique account ID: " + this.getAccountID());
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account balance: £" + this.getBalance());
		System.out.println("Account interest rate: " + this.getInterestRate() + "%");
	}
	
	
}
