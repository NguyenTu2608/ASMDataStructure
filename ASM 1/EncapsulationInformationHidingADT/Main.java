package EncapsulationInformationHidingADT;

public class Main {
    public static void main(String[] args) {
        // Create a new bank account with account number "123456"
        EncapsulationADT account = new EncapsulationADT("123456");

        // Check the initial balance
        System.out.println("Initial balance: " + account.getBalance()); // Expected: 0.0

        // Deposit money into the account
        account.deposit(500);
        System.out.println("Balance after depositing 500: " + account.getBalance()); // Expected: 500.0

        // Try depositing a negative amount
        account.deposit(-100);  // Expected: No change in balance and an error message

        // Withdraw money from the account
        account.withdraw(200);
        System.out.println("Balance after withdrawing 200: " + account.getBalance()); // Expected: 300.0

        // Try withdrawing an amount greater than the balance
        account.withdraw(400);  // Expected: No change in balance and an error message

        // Check the final balance
        System.out.println("Final balance: " + account.getBalance()); // Expected: 300.0
    }
}
