package Facade;

public class TestBankAccount {

	public static void main(String[] args) {
		
		//nieuwe facade maken en bank account nr 123456 gebruiken met code 1234
		BankAccountFacade accessingBank = new BankAccountFacade(123456, 1234);
		
		accessingBank.withDrawCash(50.00);
		accessingBank.withDrawCash(900.00);
		
		accessingBank.depositCash(200.00);
		accessingBank.depositCash(150.00);

	}

}
