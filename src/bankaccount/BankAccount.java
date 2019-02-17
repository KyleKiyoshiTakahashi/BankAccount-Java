
package bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber = ""; 
    private double checkingBalance = 0.00; 
    private double savingsBalance = 0.00; 
    private static int numberOfAccounts = 0;
    private static double totalAmountInAccount = 0.00;


public BankAccount(){
	numberOfAccounts ++;
    generateNewAccountNumber();
    System.out.println("the total number of accounts: "+ numberOfAccounts);
}

public String getAccountNumber(){
    return accountNumber;
}

private String generateNewAccountNumber(){
    String numbers = "0123456789";
    StringBuilder accString = new StringBuilder();
    Random rnd = new Random();
    while (accString.length() < 10) { 
        int index = (int) (rnd.nextFloat() * numbers.length());
        accString.append(numbers.charAt(index));
    }
    String newAccountNumber = accString.toString();
    
    accountNumber = newAccountNumber; 

    return newAccountNumber;
}

public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
}

public double getCheckingBalance(){
    System.out.println("The checking balance for this account is : $" + this.checkingBalance);
    return this.checkingBalance;
}

public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
}

public double getSavingsBalance(){
    System.out.println("The savings balance for this account is : $" + this.savingsBalance);
    return this.savingsBalance;

}

public void depositChecking(double checkingBalance){
    this.setCheckingBalance(this.getCheckingBalance()+ checkingBalance);
    totalAmountInAccount += checkingBalance;
}

public void depositSavings(double savingsBalance){
    this.setSavingsBalance(this.getSavingsBalance() + savingsBalance);
    totalAmountInAccount += savingsBalance;
}

public double total(){
    return totalAmountInAccount;
}
//google valueOf()
public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("You don't have enough money in your checking. Get a job!");
    } 
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));
        totalAmountInAccount -= Double.valueOf(amount);

    }
}

public void withdrawalSavings(int amount){
    if (getSavingsBalance() < Double.valueOf(amount)){
        System.out.println("You don't have enough money in your savings. Get a job!");
    } 
    else{
        this.setSavingsBalance(this.getSavingsBalance() - Double.valueOf(amount));
        totalAmountInAccount -= Double.valueOf(amount);
    }

}
}