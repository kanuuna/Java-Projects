package banksystem;

public class CurrentAccount extends BankAccount implements Everyday{
	
	private double theOverdraftLimit;
	private double theOverdraftAmount;
	
	public CurrentAccount(double theBalance, String theSortCode, String theAccountNumber, double theInterestRate, double theOverdraftLimit) {
		super(theBalance, theSortCode, theAccountNumber, theInterestRate);
		setTheOverdraftLimit(theOverdraftLimit);
		
	}
	
	public CurrentAccount(double theBalance, String theSortCode, String theAccountNumber) {
		super(theBalance, theSortCode, theAccountNumber);
		
	}
	
	

	public double getTheOverdraftLimit() {
		return theOverdraftLimit;
	}

	public void setTheOverdraftLimit(double theOverdraftLimit) {
		if (theOverdraftLimit <= 2500) {
			this.theOverdraftLimit = theOverdraftLimit;
		} else {
			System.out.println("Overdraft limit cannot exceed £2500. Limit now set to £0 by default.");
		}
		
	}


	public double getTheOverdraftAmount() {
		return theOverdraftAmount;
	}


	public void setTheOverdraftAmount(double theOverdraftAmount) {
		this.theOverdraftAmount = theOverdraftAmount;
	}






	@Override
	public void tickInterest() {
		if (this.theOverdraftAmount > 0) {
			double overdraftFees;
			overdraftFees = this.getInterestRate() * 0.01 * this.theOverdraftAmount;
			System.out.println("\n\nOverdraft fees for account ID: " + this.getAccountID());
			System.out.println("£" + overdraftFees + " of overdraft fees deducted from balance.\nThis account's overdraft rate is: " + this.getInterestRate() + "%");
			this.setBalance(this.getBalance() - overdraftFees);
		}
		
	}
	
	@Override
	public void makeWithdrawal(double withdrawal) {
		double currentBalance = this.getBalance();
		
		if (currentBalance - withdrawal >= 0) {
		currentBalance -= withdrawal;
		this.setBalance(currentBalance);
		System.out.println("Withdrawal of " + withdrawal + " successful.\nAccount balance is now: " + currentBalance);
		} else if (currentBalance - withdrawal < 0 && this.theOverdraftAmount - (currentBalance - withdrawal) <= this.theOverdraftLimit){
			System.out.println("Withdrawal exceeds balance. Difference of " + (withdrawal - currentBalance) + " added to overdraft.");
			this.setBalance(0);
			double currentOverdraft = this.getTheOverdraftAmount();
			this.setTheOverdraftAmount(currentOverdraft + withdrawal - currentBalance);
			
		} else {
			System.out.println("Cannot withdraw. Account overdraft cannot exceed £" + this.theOverdraftLimit);
		}
		
		
		
	}
	
	@Override
	public void accountOverview() {
		System.out.println("\n\nUnique account ID: " + this.getAccountID());
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account balance: £" + this.getBalance());
		System.out.println("Current account overdraft: £" + this.getTheOverdraftAmount());
		System.out.println("Account overdraft limit: £" + this.getTheOverdraftLimit());
		System.out.println("Account interest rate: " + this.getInterestRate() + "%");
	}
	

}
