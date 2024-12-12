package pack.cap.module5.module4;
//Generalization 
class BankAccount{
	String accountNumber;
	double balance;
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if( amount>0) {
			balance += amount;
			System.out.println("Deposited successfully : "+ amount + "New Balance :"+ balance);
		}else {
			System.out.println("deposite amount must be positive ");
		}
	}
	public void withDraw(double amount ) {
		if(amount >0 && amount <= balance ) {
			balance -= amount ; 
			System.out.println("withdrqw successfully : "+ amount + "New Balance :"+ balance);
		}else {
			System.out.println("insufficient balance ");
		}
	}
	public void checkBalance() {
		System.out.println("Balance for account "+accountNumber +" $ "+ balance);
	}
}

//specialization 
class SavingsAccount extends BankAccount{
	double intRate;
	public SavingsAccount(String accountNumber, double balance , double intRate) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.intRate = intRate;
	}
public void applyInterest () {
	double intr = balance * intRate ;
	balance += intr;
	System.out.println("Interest of $ "+ intr +" applied New balance "+ balance);
	
		}}
class CheckingAccount extends BankAccount{
	double fee;
	public CheckingAccount(String accountNumber, double balance,double fee) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.fee = fee;
	}
	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		super.withDraw(amount);
		if(amount > 0 && amount <= balance) {
			balance -= amount ; 
			balance -= fee;
			System.out.println("withdraw "+amount + " with fee of "+fee);
		}else {
			System.out.println("Insufficieant balance ");
		}
	}

	}


//Specialized BusinessAccount class
class BusinessAccount extends BankAccount {
 public BusinessAccount(String accountNumber, double balance) {
     super(accountNumber, balance);  // Calling parent constructor
 }

 // Method for transferring funds to another account
 public void transfer(BankAccount targetAccount, double amount) {
     if(amount > 0 && amount <= balance) {
         balance -= amount;
         targetAccount.deposit(amount);  // Deposit into the target account
         System.out.println("Transferred $" + amount + " to account " + targetAccount.accountNumber + ". New balance: $" + balance);
     } else {
         System.out.println("Insufficient balance or invalid transfer amount.");
     }
 }
}


public class Gen_Spe_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SavingsAccount sa = new SavingsAccount("SA123", 5000, 0.03);
    sa.deposit(10000);
    sa.applyInterest();// specialization apply for savingAccount 
    
    
    CheckingAccount ca = new CheckingAccount("CA456", 4000, 2.5);
    ca.deposit(1000);
    ca.withDraw(200);//specialization withdraw with fee for checkingAccount 
    
    BusinessAccount businessAccount = new BusinessAccount("BA789", 10000);
    businessAccount.deposit(5000);
    businessAccount.transfer(sa, 2000);  // Specialization: Transfer funds for BusinessAccount
}
    
    
	}


