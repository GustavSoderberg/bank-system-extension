package Controller;

import Model.BankAccount;
import Model.SalaryAccount;
import Model.SavingsAccount;
import Model.User;

//The BankAccountFactory-class acts as a factory & controller for the logic of creating BankAccount-objects (SalaryAccount, SavingsAccount)
public class BankAccountFactory
{
    public BankAccount bankAccount;

    public BankAccountFactory(int accountType, User user)
    {
        this.init(accountType, user);
    }

    // The factory creates the relevant object based on the user-input from the ViewManager
    public void init(int accountType, User user)
    {
        switch(accountType)
        {
            case 1:
                this.bankAccount = new SalaryAccount(user.getPersonalId(), 0.0);
                break;
            case 2:
                this.bankAccount = new SavingsAccount(user.getPersonalId(), 0.0, 2.5);
                break;
        }
    }

    //Getter for the BankAccount-object
    public BankAccount getBankAccount()
    {
        return this.bankAccount;
    }
}
