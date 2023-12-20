package Model;

import java.util.ArrayList;

//The User-class is a model of a user
public class User
{
    private final String personalId;
    private final ArrayList<BankAccount> bankAccounts;

    //Constructor for initializing a new User
    public User(String personalId)
    {
        this.personalId = personalId;
        this.bankAccounts = new ArrayList<>();
    }

    //Method to add a BankAccount to the User
    public void addBankAccount(BankAccount bankAccount)
    {
        this.bankAccounts.add(bankAccount);
    }

    //Getter for the User's bank accounts
    public ArrayList<BankAccount> getBankAccount()
    {
        return this.bankAccounts;
    }

    //Getter for the User's personalId
    public String getPersonalId()
    {
        return personalId;
    }
}