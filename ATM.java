package CodeSoft;

//Ankit kumar (ID:CS07WX33008)
//Batch: 10th aug 2023- 10th sep 2023
// task-3 [ATM INTERFACE] {Codesoft}

import java.util.Scanner;

public class ATM {

    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(int amount) {
        if (bankAccount.getBalance() >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrawal of Rs " + amount + " successful.");
        } else {
            System.out.println("Ooops!! Insufficient funds..");
        }
    }

    public void deposit(int amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Deposit of Rs " + amount + " successful.");
    }

    public void checkBalance() {
        System.out.println("Your Bank Balance is Rs " + bankAccount.getBalance());
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a bank account object
        BankAccount bankAccount = new BankAccount();

        // Create an ATM object
        ATM atm = new ATM(bankAccount);

        // Start the ATM session
        System.out.println("Welcome to the Virtual ATM Machine");
        while (true) {
            // Display the menu
            System.out.println("What would you like to do?");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();

            // Switch on the user's choice
            switch (choice) {
                case 1:
                    // Withdraw money
                    System.out.println("Enter the amount you want to withdraw: ");
                    int amount = scanner.nextInt();
                    atm.withdraw(amount);
                    break;
                case 2:
                    // Deposit money
                    System.out.println("Enter the amount you want to deposit: ");
                    amount = scanner.nextInt();
                    atm.deposit(amount);
                    break;
                case 3:
                    // Check balance
                    atm.checkBalance();
                    break;
                case 4:
                    // Exit the ATM session
                    System.out.println("Thank you for using the ATM.");
                    System.exit(0);
                default:
                    // Invalid choice
                    System.out.println("Invalid choice.");
            }
        }
    }
}

class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance=balance;
    }
}

