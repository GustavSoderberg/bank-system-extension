package Model;

import java.time.LocalDateTime;

//The BankAccount-class is an abstract model that contains the shared BankAccount parameters (balance, creationDate) between the SalaryAccount and SavingsAccount
public abstract class BankAccount
{
    private double balance;

    private final LocalDateTime creationDate;

    //Constructor for initializing a new BankAccount
    public BankAccount(double balance)
    {
        this.balance = 0.0;
        this.creationDate = LocalDateTime.now();
    }

    //Setter for the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Getter for the balance
    public double getBalance() {
        return balance;
    }

    //Getter for the creation date
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
