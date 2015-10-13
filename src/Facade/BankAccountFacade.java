package Facade;

public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accCheck;
	SecurityCodeCheck codeCheck;
	FundsCheck fundCheck;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int newAccNum, int newSecCode){
	
		accountNumber = newAccNum;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank();
		accCheck = new AccountNumberCheck();
		codeCheck = new SecurityCodeCheck();
		fundCheck = new FundsCheck();
	}
	
	public int getAccountNumber() { return accountNumber; }
	public int getSecurityNumber() { return securityCode; }
	
	public void withDrawCash(double cashToGet){
	
		//code om cash af te halen 
		//gebruikt alle classes (acc, code, fund check) 
		//en kijkt of alles goed is en voert dan de transactie uit
		
		//als alles goed is gekeurd
		System.out.println("\nAccount, pin and funds are valid");
		System.out.println("You've just withdrawed: " + cashToGet + " euro");
		
	}
	
	public void depositCash(double cashToDisposit){
	
		//zelfde als withDrawCash, alleen zonder de fundCheck
		System.out.println("\nYou've just deposited: " + cashToDisposit + " euro");
	
	}
}
