package Model;

import java.time.LocalDateTime;

//Abstrakt klass som skapar upp instans av SalaryAccount och SavingsAccount.

public abstract class BankAccount {


    public String personalId;
    public double balance;
    public LocalDateTime creationDate;

    public BankAccount(String personalId, double balance)
    {
        this.personalId = personalId;
        this.balance = balance;
        this.creationDate = LocalDateTime.now();
    }

    public String getPersonalId() {
        return personalId;
    }

    public double getBalance() {
        return balance;
    } // Metod för att se saldo

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Boolean deposit(double balance) {

        this.balance += balance;
        return true;

    } // Metod för insättning av pengar

    public Boolean withdraw(double balance) {

        if (this.balance < balance) {
            System.out.println("Otillräckliga medel");
            return false;
        }
        else {
            this.balance -= balance; //this.balance = this.balance - balance;
            return true;
        }
    } // Metod för uttag av pengar. Kollar om det finns tillräckligt pengar.
}
