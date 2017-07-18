package account;

import java.util.Random;

/**
 * This class demonstrates a basic Bank Account instance
 * @author Bisrat W Tadesse
 *
 */
public class BankAccount {
	private String account_number; //account number
	private long checking_balance; //checking balance
	private long saving_balance; //saving balance
	private static int numberOfAccounts = 0; //holds the number accounts
	private static long total_depsit_accross_accounts = 0; //holds the total
									//amount deposited from any account type
	
	/**
	 * This constructor initializes the instant variables, increments the 
	 * number of accounts by one, and calls the private method that generates
	 * an account number and assigns it to the account_number variable
	 */
	public BankAccount(){
		this.account_number = this.generateAccountNumber();
		this.checking_balance = 0;
		this.saving_balance = 0;
		BankAccount.numberOfAccounts++;
	}
	
	/**
	 * This method returns the checking balance of the account
	 * @return checking balance
	 */
	public long getCheckingBalance(){
		return this.checking_balance;
	}
	
	/**
	 * This method returns the saving balance of the account
	 * @return saving balance
	 */
	public long getSavingBalance(){
		return this.saving_balance;
	}
	
	/**
	 * This method allows the account holder to deposit money to their savings
	 * account
	 * @param amt amount to be deposited
	 */
	public void depositMoneyOnSavingAcc(long amt){
		this.saving_balance += amt;
		BankAccount.total_depsit_accross_accounts += amt;
	}
	
	/**
	 * This method allows the account holders to deposit money into their 
	 * checking account
	 * @param amt amount to be deposited
	 */
	public void depositMoneyOnCheckingAcc(long amt){
		this.checking_balance += amt;
		BankAccount.total_depsit_accross_accounts += amt;
	}
	
	/**
	 * This method allows account holders to withdraw money from their checking
	 * account if they have sufficient balance.
	 * @param amt amount to be withdrawn 
	 * @return the amount withdrawn and the remaining balance
	 */
	public String withdrawMoneyFromChecking(long amt){
		if(amt > this.checking_balance)
			return "Insufficient balance";
		else{
			this.checking_balance -= amt;
			return "You withdrawed: " + "$" +amt + "Your balance is :" 
					+ this.checking_balance;
		}
	}
	
	/**
	 * This method returns the total checking and saving amount 
	 * @return sum of saving and checking amount
	 */
	public long getTotalCeckingAndSavingAmount(){
		return this.saving_balance + this.checking_balance;
	}
	/*
	 * This method generates a ten digit random account number. It uses the 
	 * Random object 
	 */
	private String generateAccountNumber(){
		String str="";
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++){
			int index = rand.nextInt(8)+ 1;
			str += index;
		}
		
		return str;
			
	}
	
}
