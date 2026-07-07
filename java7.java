//single inheritence
//interface and implements
//threading

import java.util.Scanner;
class parents{ //-------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);                                               //|
    String mom = sc.nextLine();                                                        //|
    String dad = sc.nextLine();                                                        //|
    public void view_parents(){  //--------------------------------------------------- //|--------
        System.out.println("mom: "+mom);                                               //|      //|
        System.out.println("dad: "+dad);                                               //|      //|
    }                                                                                  //|      //|
}                                                                                      //|      //|
class kiddo extends parents{ //<----------------------------------------------------------      //|
    Scanner sc = new Scanner(System.in);                                                //|     //|
    String kid = sc.nextLine();                                                         //|     //|
    public void names(){                                //--------------------------------      //|
        System.out.println("The names in the fam are: "+mom+" ,"+ dad+" ,"+kid);                //|
    }                                                                                           //|
}                                                                                               //|
public class Main{                                                                              //|
	public static void main(String[] args) {                                                      //|
	    Scanner sc = new Scanner(System.in);                                                      //|
		kiddo kid = new kiddo();                                                                    //|
		kid.names();                                                                                //|
		kid.view_parents(); //<------------------------------------------------------------------------
	}
}




//interface and implements
// Define an interface for family behavior
interface Family {
    void showParents();
}

// Define an interface for social behavior
interface Social {
    void showFriends();
}

// Kiddo implements BOTH interfaces
class Kiddo implements Family, Social {
    private String father;
    private String mother;
    private String bestFriend;

    Kiddo(String father, String mother, String bestFriend) {
        this.father = father;
        this.mother = mother;
        this.bestFriend = bestFriend;
    }

    // Implement Family interface method
    public void showParents() {
        System.out.println("Father: " + father + ", Mother: " + mother);
    }

    // Implement Social interface method
    public void showFriends() {
        System.out.println("Best Friend: " + bestFriend);
    }
}

public class Main {
    public static void main(String[] args) {
        Kiddo kid = new Kiddo("John", "Mary", "Alex");

        kid.showParents();  // from Family interface
        kid.showFriends();  // from Social interface
    }
}






//threading
class Bank {
    private int balance = 100;

    // Synchronized ensures only one thread accesses the account at a time
    public synchronized void withdraw(String customerName, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(customerName + " withdrawn " + amount + " Balance: " + balance);
        } else {
            System.out.println(customerName + " you can not withdraw " + amount + " Your balance is: " + balance);
        }
    }

    public synchronized void deposit(String customerName, int amount) {
        balance += amount;
        System.out.println(customerName + " deposited " + amount + " Balance after deposit: " + balance);
    }
}

class ThreadWithdrawal extends Thread {
    private Bank bank;
    private String name;
    private int amount;

    public ThreadWithdrawal(Bank bank, String name, int amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        bank.withdraw(name, amount);
        try {
            Thread.sleep(1000); // Pause thread for 1 second
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ThreadDeposit extends Thread {
    private Bank bank;
    private String name;
    private int amount;

    public ThreadDeposit(Bank bank, String name, int amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        bank.deposit(name, amount);
        try {
            Thread.sleep(1000); // Pause thread for 1 second
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sharedBank = new Bank();

        // Create multiple threads
        Thread t1 = new ThreadWithdrawal(sharedBank, "Arnab", 20);
        Thread t2 = new ThreadWithdrawal(sharedBank, "Monodwip", 40);
        Thread t3 = new ThreadDeposit(sharedBank, "Mukta", 35);
        Thread t4 = new ThreadWithdrawal(sharedBank, "Rinkel", 80);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
