package Model;

//A SalaryAccount-class is a model of a user's salary-account that's comes with a free debit card
public class SalaryAccount extends BankAccount
{

    private final DebitCard debitCard;

    //Constructor for initializing a new SalaryAccount
    public SalaryAccount(String personalId, double balance)
    {
        super(balance);
        this.debitCard = new DebitCard("5050505050", 4304);
    }

    //Getter for the debit card
    public DebitCard getDebitCard()
    {
        return debitCard;
    }
}
