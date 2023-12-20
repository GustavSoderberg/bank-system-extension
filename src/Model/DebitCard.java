package Model;

//A DebitCard-class is a model of a user's debit card linked to a SalaryAccount
public class DebitCard {

    private final String cardNumber;
    private final int pinCode;

    //Constructor for initializing a new DebitCard
    public DebitCard(String cardNumber, int pinCode)
    {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    //Getter for the card number
    public String getCardNumber()
    {
        return cardNumber;
    }

    //Getter for the pin code
    public int getPinCode()
    {
        return pinCode;
    }
}
