package org.example;


    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }


    class BankAccount {
        private double balance;


        public BankAccount(double balance) {
            this.balance = balance;
        }

        // Withdraw method
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount! Amount cannot be negative.");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }
            balance -= amount; // Deduct the amount from balance
            System.out.println("Withdrawal successful, new balance: " + balance);
        }

        public double getBalance() {
            return balance;
        }
    }

    public class Code10 {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(5000.0); // Initial balance is 5000

            try {
                // Try to withdraw an amount
                account.withdraw(6000); // Try to withdraw more than the balance
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage()); // Handle Insufficient balance exception
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Handle invalid amount exception
            }

            try {
                // Try to withdraw a negative amount
                account.withdraw(-100); // Try to withdraw a negative amount
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage()); // Handle Insufficient balance exception
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Handle invalid amount exception
            }

            try {
                // Try to withdraw a valid amount
                account.withdraw(1000); // Valid withdrawal
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage()); // Handle Insufficient balance exception
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Handle invalid amount exception
            }
        }
    }


