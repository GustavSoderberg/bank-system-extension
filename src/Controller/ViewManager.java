package Controller;

import Model.BankAccount;
import Model.User;
import java.util.Scanner;

public class ViewManager
{
    public static void run()
    {
        Boolean wantsToContinue = false;
        Boolean wantsToCreateAccount = true;
        BankAccountFactory baf;
        Scanner scan = new Scanner(System.in);
        User user = new User("603580");

        String input;

        //Loop för användar input. Val om lönekonto eller sparkonto.
            System.out.println("Välkommen!");
            while (wantsToCreateAccount) {
            System.out.println("Skriv 1 för att skapa ett 'Lönekonto' eller 2 för ett 'Sparkonto'");
            String inputAccountType = scan.nextLine();


            if (inputAccountType.equals("1") || inputAccountType.equals("2"))
            {
                baf = new BankAccountFactory(Integer.parseInt(inputAccountType), user);
                user.addBankAccount(baf.getBankAccount());

                System.out.println("Ditt konto har nu skapats!");
                System.out.println(baf.bankAccount.getCreationDate());
                wantsToContinue = true;
            }
            else
            {
                System.out.println("Det blev fel. Försök igen, eller vill du avsluta?(J/N)");
                input = scan.nextLine();
                switch (input.toLowerCase())
                {
                    case "j":
                        break;

                    case "n":
                        wantsToCreateAccount = false;
                }
            }

            while (wantsToContinue)
            {
                double preBalance = user.getBankAccount().get(0).getBalance();

                // Switch case uppbyggd som meny med val man kan göra i kontot man skapat.
                System.out.println("1. Insättning\n2. Uttag\n3. Se saldo\n4. Skapa ett sparkonto\n0. Avsluta");
                input = scan.nextLine();
                switch (input.toLowerCase())
                {
                    case "1":
                        System.out.println("Hur mycket vill du sätta in?");
                        input = scan.nextLine();
                        preBalance = user.getBankAccount().get(0).getBalance();
                        try
                        {
                            double textAsDouble = Double.parseDouble(input);
                            double result = preBalance + textAsDouble;
                            user.getBankAccount().get(0).setBalance(result);
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println("The string does not contain a valid number.");
                        }

                        System.out.println(input + " är nu insatt på ditt konto");
                        break;

                    case "2":
                        System.out.println("Hur mycket vill du ta ut?");
                        input = scan.nextLine();
                        preBalance = user.getBankAccount().get(0).getBalance();
                        try
                        {
                            double textAsDouble = Double.parseDouble(input);
                            double result = preBalance - textAsDouble;
                            user.getBankAccount().get(0).setBalance(result);
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println("The string does not contain a valid number.");
                        }

                        System.out.println("Du har tagit ut: " + String.format(input));
                        break;

                    case "3":
                        displayAccounts(user);
                        break;

                    case "4":
                        wantsToContinue = false;
                        break;

                    case "0":
                        wantsToContinue = false;
                        wantsToCreateAccount = false;

                }
            }
        }
    }

    static void displayAccounts(User user)
    {
        int i = 1;
        String message = "";

        if (!user.getBankAccount().isEmpty())
        {
            for (BankAccount bankAccount : user.getBankAccount())
            {
                message += "Bankkontonummer " + i + " har ett saldo på: " + String.format("%.2f", bankAccount.getBalance()) + "\n";
                i++;
            }
        }
        else
        {
            message = "Du har inga bankkonton";
        }

        System.out.format(message);
    }
}
