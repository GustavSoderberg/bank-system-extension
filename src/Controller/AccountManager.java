package Controller;
//Klass som hämtar instanser av BankAccount

import Model.BankAccount;
import Model.SalaryAccount;
import Model.SavingsAccount;
import Model.User;

public class AccountManager {

    public BankAccount bankAccount;

    public AccountManager(int accountType, User user) {

        this.init(accountType, user);

    }

    // Metod där användaren väljer antingen Salary eller SavingsAccount
    public void init(int accountType, User user) {
        switch(accountType) {
            case 1:
                this.bankAccount = new SalaryAccount(user.getPersonalId(), 0.0);
                break;
            case 2:
                this.bankAccount = new SavingsAccount(user.getPersonalId(), 0.0, 2.5);
                break;
        }
    }

    public Boolean deposit(double balance) {

        double oldBalance = this.bankAccount.getBalance();
        this.bankAccount.setBalance(oldBalance + balance);
        return true;
    }

    public Boolean withdraw(double balance) {

        if (this.bankAccount.getBalance() < balance) {
            System.out.println("Otillräckliga medel");
            return false;
        }
        else {
            double oldBalance = this.bankAccount.getBalance();
            this.bankAccount.setBalance(oldBalance - balance);
            return true;
        }
    } // Metod för uttag av pengar. Kollar om det finns tillräckligt pengar.

    public Boolean buy(int amount) {

        if (this.bankAccount.getBalance() > amount) {
            //TODO: Logic for buy: this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
    public BankAccount getBankAccount() {
        return this.bankAccount;
    }
}
