package banksystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Creating and testing savings accounts
		SavingsAccount firstSavings = new SavingsAccount(12.00, "856412", "85493256", 10);
		System.out.println(firstSavings.getAccountID());
		
		SavingsAccount secondSavings = new SavingsAccount(25.00, "856412", "85493753", 0.1);
		System.out.println(secondSavings.getAccountID());
		
		firstSavings.getBalance();
		firstSavings.makeWithdrawal(10.00);
		firstSavings.makeDeposit(100);
		firstSavings.getBalance();
		firstSavings.tickInterest();
		
		firstSavings.changeInterest(100);
		firstSavings.tickInterest();
		firstSavings.makeWithdrawal(10000.00);
		
		System.out.println(firstSavings.getAccountID());
		System.out.println(secondSavings.getAccountID());
		
		
		//Testing customer functions
		
		BankCustomer firstCustomer = new BankCustomer("Antti" , "Makarainen");
		ISAAccount firstISA = new ISAAccount(12.00, "856412", "85491754");
		CurrentAccount firstCurrent = new CurrentAccount(12.00, "856412", "85493256", 14, 2000);
		
		firstCustomer.addAccount(firstSavings);
		firstCustomer.addAccount(secondSavings);
		firstCustomer.addAccount(firstISA);
		firstCustomer.addAccount(firstCurrent);
		firstCustomer.listAccounts();
		firstCustomer.listAccountOverviews();
		
		firstCustomer.tickInterest();
		
		
	}

		
		/*
		ISAAccount firstISA = new ISAAccount(12.00, "856412", "85493256");
		System.out.println(firstISA.getAccountID());
		System.out.println(firstISA.getInterestRate());
		firstISA.changeInterest(30);
		System.out.println(firstISA.getInterestRate());
		
		ISAAccount secondISA = new ISAAccount(25.00, "856412", "85493456");
		System.out.println(secondISA.getAccountID());
		
		firstISA.accountOverview();
		firstISA.tickInterest();
		firstISA.accountOverview();
		
		firstISA.makeWithdrawal(10);
		firstISA.accountOverview();
		*/
		
		/*
		CurrentAccount firstCurrent = new CurrentAccount(12.00, "856412", "85493256", 14, 2000);
		firstCurrent.accountOverview();
		
		firstCurrent.makeWithdrawal(15);
		firstCurrent.accountOverview();
		
		firstCurrent.makeWithdrawal(2000);
		firstCurrent.accountOverview();
		
		firstCurrent.tickInterest();
		firstCurrent.changeInterest(10);
		
		firstCurrent.tickInterest();
		firstCurrent.accountOverview();
		
		CurrentAccount secondCurrent = new CurrentAccount(12, "852741", "75421365");
		secondCurrent.accountOverview();
		
		
	}
		
	
	*/
	
	
	
	
	
	
	
	
		
}





