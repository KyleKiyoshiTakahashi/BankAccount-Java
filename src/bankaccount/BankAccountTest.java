package bankaccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		 BankAccount account1 = new BankAccount();
		 BankAccount account2 = new BankAccount();
	        
	        System.out.println("The bank account number for this account is : " + account1.getAccountNumber());
	        account1.getCheckingBalance();
	        account1.getSavingsBalance();
	        account1.depositChecking(10);
	        account1.depositChecking(300);
	        account1.depositSavings(1000);
	        account1.withdrawalChecking(75);
	        account1.withdrawalSavings(7500);
	        System.out.println(account1.getCheckingBalance());
	        System.out.println(account1.getSavingsBalance());
	        account1.total();
	        System.out.println("The total amount in both the checking and savings accounts for this account is : $" + account1.total());
	       
	        System.out.println("The bank account number for this account is : " + account2.getAccountNumber());
	        account2.getCheckingBalance();
	        account2.getSavingsBalance();
	        account2.depositChecking(2500);
	        account2.depositSavings(1300);
	        account2.withdrawalChecking(400);
	        account2.withdrawalSavings(7500);
	        System.out.println(account2.getCheckingBalance());
	        System.out.println(account2.getSavingsBalance());
	        account2.total();
	        System.out.println("The total amount in both the checking and savings accounts for this account is : $" + account2.total());
	}
}

