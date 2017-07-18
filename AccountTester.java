package account;

public class AccountTester {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		System.out.println(acc.getCheckingBalance());
		
		acc.depositMoneyOnCheckingAcc(3000);
		
		System.out.println(acc.getCheckingBalance());
		
		acc.withdrawMoneyFromChecking(1500);
		
		System.out.println(acc.getCheckingBalance());

	}

}
