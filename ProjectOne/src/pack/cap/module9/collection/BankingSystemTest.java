package pack.cap.module9.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class Account {
    private int accountId;
    private String accountHolderName;
    private double balance;
    private boolean isActive;
	public Account(int accountId, String accountHolderName, double balance, boolean isActive) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.isActive = isActive;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public boolean isActive() {
		return isActive;
	}
    
	

    // Methods to deposit and withdraw money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

   
    public void deactivate() {
        this.isActive = false;
    }
}

 class BankingSystem{
	 private Set<Account> accounts;
	 public BankingSystem() {
	        accounts = new HashSet<>();
	    }
	 public void addAccount(Account account) {
		 if(accounts.add(account)) {
			 System.out.println("account added "+ account);
		 }else {
			 System.out.println("account already exists");
		 }
	 }

	 public void removeInactiveAccounts() {
		 accounts.removeIf(account-> !account.isActive());
		 System.out.println("Removed inactive accounts ");
	 }
	 
	 public void deposit(int accountId, double amount) {
		 accounts.stream().filter(account-> account.getAccountId() == accountId).findFirst().ifPresent(account-> account.deposit(amount));
		 System.out.println("Money Deposited : "+ amount + " into account "+ accountId);
	 }
	 public void withdraw(int accountId, double amount) {
		 accounts.stream().filter(account-> account.getAccountId() == accountId).findFirst()
		 .ifPresent(account-> {if (account.withdraw(amount)){
			 System.out.println("withdraw "+amount +" from "+ accountId);
		 }else { System.out.println(" Insufficient funds ");}}
				 );
		 System.out.println("Money Deposited : "+ amount + " into account "+ accountId);
	 }
	 public void checkBalance(int accountId) {
		 accounts.stream().filter(account -> account.getAccountId() == accountId).findFirst()
		 .ifPresentOrElse(account -> System.out.println("balance of account "+ accountId + account.getBalance()),
				 ()-> System.out.println("Account "+accountId +"not found"));
	 }
	 public void showAccountWithMaxBalance() {
	        Account maxAccount = accounts.stream()
	                .max(Comparator.comparingDouble(Account::getBalance))
	                .orElse(null);

	        if (maxAccount != null) {
	            System.out.println("Account with the highest balance: " + maxAccount);
	        } else {
	            System.out.println("No accounts found.");
	        }
	    }

	    // Show account with minimum balance
	    public void showAccountWithMinBalance() {
	        Account minAccount = accounts.stream()
	                .min(Comparator.comparingDouble(Account::getBalance))
	                .orElse(null);

	        if (minAccount != null) {
	            System.out.println("Account with the lowest balance: " + minAccount);
	        } else {
	            System.out.println("No accounts found.");
	        }
	    }

	    // Display all accounts
	    public void displayAllAccounts() {
	        accounts.forEach(System.out::println);
	    }

	    public void displayAccountsWithBalanceGreaterThan(double amount) {
	        accounts.stream()
	                .filter(account -> account.getBalance() > amount)
	                .forEach(System.out::println);
	    }
 }
 public class BankingSystemTest {
	    public static void main(String[] args) {

	        // Create a new BankingSystem object
	        BankingSystem bankingSystem = new BankingSystem();

	        // Create new accounts
	        Account account1 = new Account(101, "Alice", 1000.0, true);
	        Account account2 = new Account(102, "Bob", 2500.0, true);
	        Account account3 = new Account(103, "Charlie", 500.0, false);  // Inactive account
	        Account account4 = new Account(104, "David", 1500.0, true);
	        Account account5 = new Account(105, "Eva", 3000.0, true);

	        // Add accounts to the banking system
	        bankingSystem.addAccount(account1);
	        bankingSystem.addAccount(account2);
	        bankingSystem.addAccount(account3);  // Inactive
	        bankingSystem.addAccount(account4);
	        bankingSystem.addAccount(account5);

	        // Display all accounts
	        System.out.println("All accounts:");
	        bankingSystem.displayAllAccounts();

	        // Perform some banking operations
	        bankingSystem.deposit(101, 500.0); // Alice deposits 500
	        bankingSystem.withdraw(102, 200.0); // Bob withdraws 200
	        bankingSystem.checkBalance(104); // Check balance of David's account

	        // Remove inactive accounts
	        bankingSystem.removeInactiveAccounts();

	        // Display all accounts after removing inactive ones
	        System.out.println("\nAfter removing inactive accounts:");
	        bankingSystem.displayAllAccounts();

	        // Show account with maximum and minimum balances
	        bankingSystem.showAccountWithMaxBalance();
	        bankingSystem.showAccountWithMinBalance();

	        // Display accounts with balance greater than a specific amount
	        System.out.println("\nAccounts with balance greater than 1500:");
	        bankingSystem.displayAccountsWithBalanceGreaterThan(1500);
	    }
	}
