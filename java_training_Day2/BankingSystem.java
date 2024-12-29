package vkraft_java_training_Day2;

import java.util.Scanner;


class BankAccount {
 protected String accountHolderName;
 protected String accountNumber;
 protected double balance;

 public BankAccount(String accountHolderName, String accountNumber, double balance) {
     this.accountHolderName = accountHolderName;
     this.accountNumber = accountNumber;
     this.balance = balance;
 }


 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Amount should be greater than zero.");
     }
 }


 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance!");
     }
 }


 public void checkBalance() {
     System.out.println("Current Balance: " + balance);
 }


 public void displayAccountDetails() {
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}


class SavingsAccount extends BankAccount {
 private static final double MIN_BALANCE = 500.0;

 public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
     super(accountHolderName, accountNumber, balance);
 }

 
 @Override
 public void withdraw(double amount) {
     if (balance - amount < MIN_BALANCE) {
         System.out.println("Withdrawal failed! Minimum balance of " + MIN_BALANCE + " is required.");
     } else {
         super.withdraw(amount);
     }
 }
}

class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
     super(accountHolderName, accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 
 @Override
 public void withdraw(double amount) {
     if (balance - amount < -overdraftLimit) {
         System.out.println("Withdrawal failed! Exceeds overdraft limit.");
     } else {
         super.withdraw(amount);
     }
 }
}


public class BankingSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to the Banking System!");

     
     System.out.print("Enter Savings Account Holder Name: ");
     String savingsAccountHolder = scanner.nextLine();
     System.out.print("Enter Savings Account Number: ");
     String savingsAccountNumber = scanner.nextLine();
     System.out.print("Enter Initial Deposit for Savings Account: ");
     double savingsBalance = scanner.nextDouble();
     SavingsAccount savingsAccount = new SavingsAccount(savingsAccountHolder, savingsAccountNumber, savingsBalance);

     
     scanner.nextLine(); 
     System.out.print("Enter Current Account Holder Name: ");
     String currentAccountHolder = scanner.nextLine();
     System.out.print("Enter Current Account Number: ");
     String currentAccountNumber = scanner.nextLine();
     System.out.print("Enter Initial Deposit for Current Account: ");
     double currentBalance = scanner.nextDouble();
     System.out.print("Enter Overdraft Limit for Current Account: ");
     double overdraftLimit = scanner.nextDouble();
     CurrentAccount currentAccount = new CurrentAccount(currentAccountHolder, currentAccountNumber, currentBalance, overdraftLimit);

     
     while (true) {
         System.out.println("\n--- Banking System Menu ---");
         System.out.println("1. Deposit Money");
         System.out.println("2. Withdraw Money");
         System.out.println("3. Check Balance");
         System.out.println("4. Display Account Details");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");
         int option = scanner.nextInt();

         if (option == 1) {
             System.out.print("Enter amount to deposit: ");
             double amount = scanner.nextDouble();
             System.out.println("Choose Account (1 for Savings, 2 for Current): ");
             int accountChoice = scanner.nextInt();
             if (accountChoice == 1) {
                 savingsAccount.deposit(amount);
             } else if (accountChoice == 2) {
                 currentAccount.deposit(amount);
             } else {
                 System.out.println("Invalid Account Choice!");
             }
         } else if (option == 2) {
             System.out.print("Enter amount to withdraw: ");
             double amount = scanner.nextDouble();
             System.out.println("Choose Account (1 for Savings, 2 for Current): ");
             int accountChoice = scanner.nextInt();
             if (accountChoice == 1) {
                 savingsAccount.withdraw(amount);
             } else if (accountChoice == 2) {
                 currentAccount.withdraw(amount);
             } else {
                 System.out.println("Invalid Account Choice!");
             }
         } else if (option == 3) {
             System.out.println("Choose Account (1 for Savings, 2 for Current): ");
             int accountChoice = scanner.nextInt();
             if (accountChoice == 1) {
                 savingsAccount.checkBalance();
             } else if (accountChoice == 2) {
                 currentAccount.checkBalance();
             } else {
                 System.out.println("Invalid Account Choice!");
             }
         } else if (option == 4) {
             System.out.println("Choose Account (1 for Savings, 2 for Current): ");
             int accountChoice = scanner.nextInt();
             if (accountChoice == 1) {
                 savingsAccount.displayAccountDetails();
             } else if (accountChoice == 2) {
                 currentAccount.displayAccountDetails();
             } else {
                 System.out.println("Invalid Account Choice!");
             }
         } else if (option == 5) {
             System.out.println("Exiting... Thank you for using the Banking System!");
             break;
         } else {
             System.out.println("Invalid Option! Please try again.");
         }
     }

     scanner.close();
 }
}
