//abstarct class, methods, inheritence, @OverRide, super


// 1. The Abstract Class defining the "blueprint" of a bank account
abstract class BankAccount {         //abstract class using abstract keyword -- cant create objects
    protected String accountNumber; //bot public so hidden
    protected double balance;

    // Regular constructor
    public BankAccount(String accountNumber, double initialBalance) { //public non abstarct method in the public for constrcutor
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Concrete method: Common functionality shared by ALL accounts
    public void displayBalance() { //public non abstarct method which has body
        System.out.println("Account: " + accountNumber + " | Current Balance: $" + balance);
    }

    // Abstract methods: Forcing subclasses to define their own specific logic
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);   //public abstarct methods that do not have any body; but can be inherited using the word EXTENDS,@OVERRIDE and then give some functions
}

// 2. Concrete Subclass for Savings Account
class SavingsAccount extends BankAccount {      //public class inheriting an abstract class
    private static final double MINIMUM_BALANCE = 100.00;

    public SavingsAccount(String accountNumber, double initialBalance) {    //method declared here, but using objects from abstract class
        super(accountNumber, initialBalance); //to refer directly to the immediate parent class object. It acts as a bridge that allows a child class (subclass) to interact with the variables, methods, and constructors of its parent class (superclass).
    }

    @Override       //using abstarct methods and giving them desired functionalitites
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Savings Account.");
    }

    @Override
    public void withdraw(double amount) {       //using abstarct methods and giving them desired functionalitites
        // Savings account specific logic: Enforce a strict minimum balance rule
        if ((balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Transaction Denied: Savings accounts must maintain a $" + MINIMUM_BALANCE + " minimum balance.");
        }
    }
}

// 3. Concrete Subclass for Current (Checking) Account
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 500.00; // Allows account to go negative

    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        // Current account specific logic: Evaluate overdraft allowance instead of a minimum floor
        if ((balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Current Account.");
        } else {
            System.out.println("Transaction Denied: Overdraft limit exceeded.");
        }
    }
}

// 4. Execution Class simulating the ATM/Banking platform
public class BankingSystem {
    public static void main(String[] args) {
        // Using the abstract parent type as a reference (Polymorphism)
        BankAccount customerSavings = new SavingsAccount("SAV-9876", 150.00);
        BankAccount customerCurrent = new CurrentAccount("CUR-1234", 200.00);

        System.out.println("--- Executing Savings Operations ---");
        customerSavings.displayBalance();
        customerSavings.withdraw(100.00); // Will fail because it breaches the $100 min balance rule
        
        System.out.println("\n--- Executing Current Operations ---");
        customerCurrent.displayBalance();
        customerCurrent.withdraw(400.00); // Will pass because overdraft limit handles the -$200 depth
        customerCurrent.displayBalance();
    }
}

/*
import java.util.ArrayList;
import java.util.List;

abstract class BankAccount { 
    protected String accountNumber; 
    protected double balance; 

    public BankAccount(String accountNumber, double initialBalance) { 
        this.accountNumber = accountNumber; 
        this.balance = initialBalance; 
    } 

    public void displayBalance() { 
        System.out.println("Account: " + accountNumber + " | Current Balance: $" + balance); 
    } 

    public abstract void deposit(double amount); 
    public abstract void withdraw(double amount); 
} 


class SavingsAccount extends BankAccount { 
    private static final double MINIMUM_BALANCE = 800.00; 

    public SavingsAccount(String accountNumber, double initialBalance) { 
        super(accountNumber, initialBalance); 
    } 

    @Override 
    public void deposit(double amount) { 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Savings Account."); 
    } 

    @Override 
    public void withdraw(double amount) { 
        if ((balance - amount) >= MINIMUM_BALANCE) { 
            balance -= amount; 
            System.out.println("Withdrew $" + amount + " from Savings Account."); 
        } else { 
            System.out.println("Transaction Denied: Savings accounts must maintain a $" + MINIMUM_BALANCE + " minimum balance."); 
        } 
    } 
} 

class CurrentAccount extends BankAccount { 
    private double overdraftLimit = 100.00; 

    public CurrentAccount(String accountNumber, double initialBalance) { 
        super(accountNumber, initialBalance); 
    } 

    @Override 
    public void deposit(double amount) { 
        balance += amount; 
        System.out.println("Deposited $" + amount + " to Current Account."); 
    } 

    @Override 
    public void withdraw(double amount) { 
        if ((balance + overdraftLimit) >= amount) { 
            balance -= amount; 
            System.out.println("Withdrew $" + amount + " from Current Account."); 
        } else { 
            System.out.println("Transaction Denied: Overdraft limit exceeded."); 
        } 
    } 
} 

class AutopaySystem {
    public static void processBills(BankAccount account, List<Double> bills) {
        System.out.println("\n--- Processing Autopay ---");
        
        for (int i = 0; i < bills.size(); i++) {
            double billAmount = bills.get(i);
            System.out.println("Attempting to pay bill #" + (i + 1) + " of $" + billAmount);
            account.withdraw(billAmount);
        }
    }
}

public class Main { 
    public static void main(String[] args) { 
        BankAccount customerSavings = new SavingsAccount("SAV-9876", 150.00); 
        BankAccount customerCurrent = new CurrentAccount("CUR-1234", 200.00); 

        System.out.println("--- Executing Savings Operations ---");
        customerSavings.displayBalance(); 
        customerSavings.withdraw(100.00);

        System.out.println("\n--- Executing Current Operations ---");
        customerCurrent.displayBalance(); 
        customerCurrent.withdraw(400.00); 
        customerCurrent.displayBalance(); 
        List<Double> monthlyBills = new ArrayList<>();
        monthlyBills.add(50.00);
        monthlyBills.add(30.00);
        monthlyBills.add(70.00);

        AutopaySystem.processBills(customerCurrent, monthlyBills);
        
        System.out.println("\n--- Final Balance ---");
        customerCurrent.displayBalance();
    } 
}
*/
