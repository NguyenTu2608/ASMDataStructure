package EncapsulationInformationHidingADT;
public class EncapsulationADT {
    private String accountNumber;
    private double balance;
    // Constructor
    public EncapsulationADT(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {  // Validation: Amount must be positive
            balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Validation: Cannot withdraw more than the balance
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
    // Method to get the balance
    public double getBalance() {
        return balance;
    }
    // Method to get the account number (if necessary)
    public String getAccountNumber() {
        return accountNumber;
    }
}
