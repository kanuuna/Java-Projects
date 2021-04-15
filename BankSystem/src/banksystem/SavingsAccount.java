package banksystem;

public class SavingsAccount extends BankAccount implements PersonalSaver{
	
	
	public SavingsAccount(double theBalance, String theSortCode, String theAccountNumber, double theInterestRate) {
		super(theBalance, theSortCode, theAccountNumber, theInterestRate);
	}
	
	@Override
	public void makeWithdrawal(double withdrawal) {
		double currentBalance = this.getBalance();
		if (currentBalance >= withdrawal) {
			currentBalance -= withdrawal;
			this.setBalance(currentBalance);
			System.out.println("Withdrawal of " + withdrawal + " successful.\nAccount balance is now: " + currentBalance);
		} else {
			System.out.println("Cannot withdraw. Requested amount exceeds account balance");
		}
		
		
	}
	
	
	
}
