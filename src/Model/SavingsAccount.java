package Model;

import java.time.LocalDateTime;

//A SavingsAccount-class is a model of a user's savings-account that's comes with interest rate and a date for calculating the last time it received interest-payout
public class SavingsAccount extends BankAccount
{
    private final double interestRate;
    private LocalDateTime lastInterestPayout;

    //Constructor for initializing a new SavingsAccount
    public SavingsAccount(String personalId, double balance, double interestRate)
    {
        super(balance);
        this.interestRate = interestRate;
    }

    //Getter for the interest rate
    public double getInterestRate()
    {
        return interestRate;
    }

    //Getter for the last payout date
    public LocalDateTime getLastInterestPayout()
    {
        return lastInterestPayout;
    }

    //Setter for the last payout date
    public void setLastInterestPayout(LocalDateTime lastInterestPayout)
    {
        this.lastInterestPayout = lastInterestPayout;
    }
}