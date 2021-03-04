package ro.ase.csie.cts.g1093.laboratory.models;

import ro.ase.csie.cts.g1093.laboratory.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount{
	
	public static final double MIN_BALANCE = 100;
	
	
	public SavingsAccount(String iban) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void deposit(Double amount) {
		this.balance += amount;
		
		
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		this.balance += amount;
		if(amount > this.balance) {
			throw new InsufficientFundsException("you need more money");
			
		}else
			this.balance -= amount;
		
	}

	@Override
	public void transfer(Account destination, Double amount) {
		// TODO Auto-generated method stub
		
	}
	
	

}
