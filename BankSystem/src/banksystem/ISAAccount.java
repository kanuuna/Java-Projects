package banksystem;

public class ISAAccount extends BankAccount implements PersonalSaver{
	
	private static double theInterestRate = 14.5;
	
	
	
	public ISAAccount(double theBalance, String theSortCode, String theAccountNumber) {
		super(theBalance, theSortCode, theAccountNumber, theInterestRate);
		setInterestRate(theInterestRate);
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









