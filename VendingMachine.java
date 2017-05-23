import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * VendingMachine.java - SEP-25-2016 - ITEC 324: Project 1 -
 * This class contains all of the methods that control and manipulate the CurrencyControl, ProductControl, and
 * Operator classes. Simulates a vending machine.
 * @author Tre Haga
 * @version 1.0
 */
public class VendingMachine
{
    /**
     * The VendingMachine class instance variables.
     * Declares an instance of CurrencyControl, ProductControl, Operator.
     * Declares a boolean condition (quit) that exits the program.
     */
    private CurrencyControl currencyControl;
    private ProductControl productControl;
    private Operator operatorControl;
    private boolean quit;
    /**
     * The VendingMachine class constructor.
     * Initializes the CurrencyControl, ProductControl, and Operator classes.
     * Initializes the boolean condition (quit) to false.
     */
    public VendingMachine()
    {
        currencyControl = new CurrencyControl();
        productControl = new ProductControl();
        operatorControl = new Operator();
        quit = false;
    }
    /**
     * This method starts the program.
     * Displays options for the user to choose from.
     * Calls other methods depending on the actions taken.
     */
    public void start()
    {
        Scanner inputScanner = new Scanner(System.in);
        boolean isValidOption = true;
        String input;

        System.out.println("Welcome to the vending machine!\nPlease use the designated letter code for each choice.");

        while (!quit && isValidOption)
        {
            System.out.println("[A]Buy\n[B]Operator\n[C]Exit");
            System.out.println("What would you like to do?: ");
            input = inputScanner.nextLine().toUpperCase();
            switch (input)
            {
                case "A":
                    buyingOptions();
                    break;
                case "B":
                    operatorOptions();
                    break;
                case "C":
                    System.out.println("Thank you and please come again!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    isValidOption = true;
            }
        }
    }
    /**
     * Method that controls all of the buying options for the user.
     * Calls methods from the CurrencyControl and ProductControl methods depending on the choices.
     */
    private void buyingOptions()
    {
        Scanner inputScanner = new Scanner(System.in);
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        boolean isValidInput = true;
        boolean isNotFinished = true;
        boolean invalidFunds = true;
        boolean invalidOption = true;
        boolean outOfStock = false;
        double money = 0.00;
        String input = "";

        while (isValidInput)
        {
            System.out.println("How much money would you like to insert? Please use the format (#.##): ");
            try
            {
                Scanner moneyScanner = new Scanner(System.in);
                money = moneyScanner.nextDouble();
                currencyControl.setCustomerBalance(money);
                isValidInput = false;
            }
            catch (Exception exception)
            {
                System.out.println("Invalid input. Please try again.");
                isValidInput = true;
            }
        }
        while (invalidOption && invalidFunds && !outOfStock || isNotFinished)
        {
            System.out.println("Your current balance: $" + numberFormat.format(currencyControl.getCustomerBalance()));
            System.out.println("[A]Gum: $" + numberFormat.format(productControl.getGumPrice()));
            System.out.println("[B]Candy Bar: $" + numberFormat.format(productControl.getCandyBarPrice()));
            System.out.println("[C]Soda: $" + numberFormat.format(productControl.getSodaPrice()));
            System.out.println("[D]Chips: $" + numberFormat.format(productControl.getChipsPrice()));
            System.out.println("[E]Refund/Get Change");
            System.out.println("What item would you like to buy?: ");
            input = inputScanner.nextLine().toUpperCase();

            switch (input)
            {
                case "A":
                    invalidFunds = currencyControl.checkFunds(money, productControl.getGumPrice());
                    if (!invalidFunds)
                    {
                        if (productControl.getGumStock() != 0)
                        {
                            outOfStock = false;
                            money = currencyControl.calculateChange(money, productControl.getGumPrice());
                            productControl.setGumStock(productControl.getGumStock() - 1);
                        }
                        else
                        {
                            outOfStock = true;
                        }
                    }
                    else
                    {
                        outOfStock = false;
                    }
                    break;
                case "B":
                    invalidFunds = currencyControl.checkFunds(money, productControl.getCandyBarPrice());
                    if (!invalidFunds)
                    {
                        if (productControl.getCandyBarStock() != 0)
                        {
                            outOfStock = false;
                            money = currencyControl.calculateChange(money, productControl.getCandyBarPrice());
                            productControl.setCandyBarStock(productControl.getCandyBarStock() - 1);
                        }
                        else
                        {
                            outOfStock = true;
                        }
                    }
                    else
                    {
                        outOfStock = false;
                    }
                    break;
                case "C":
                    invalidFunds = currencyControl.checkFunds(money, productControl.getSodaPrice());
                    if (!invalidFunds)
                    {
                        if (productControl.getSodaStock() != 0)
                        {
                            outOfStock = false;
                            money = currencyControl.calculateChange(money, productControl.getSodaPrice());
                            productControl.setSodaStock(productControl.getSodaStock() - 1);
                        }
                        else
                        {
                            outOfStock = true;
                        }
                    }
                    else
                    {
                        outOfStock = false;
                    }
                    break;
                case "D":
                    invalidFunds = currencyControl.checkFunds(money, productControl.getChipsPrice());
                    if (!invalidFunds)
                    {
                        if (productControl.getChipsStock() != 0)
                        {
                            outOfStock = false;
                            money = currencyControl.calculateChange(money, productControl.getChipsPrice());
                            productControl.setChipsStock(productControl.getChipsStock() - 1);
                        }
                        else
                        {
                            outOfStock = true;
                        }
                    }
                    else
                    {
                        outOfStock = false;
                    }
                    break;
                case "E":
                    invalidFunds = false;
                    outOfStock = false;
                    isNotFinished = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    invalidOption = true;
                    invalidFunds = false;
                    outOfStock = false;
            }
            if (outOfStock)
            {
                System.out.println("Item is currently out of stock. Please choose another item.");
            }
            else if (invalidFunds)
            {
                System.out.println("Insufficient funds. Please choose another item.");
            }
            else if (!isNotFinished)
            {
                System.out.println("Your change is: $" + numberFormat.format(currencyControl.getCustomerBalance()));
            }
        }
    }
    /**
     * Method that controls all of the operator options for the user.
     * Calls methods from the operator class depending on the choices.
     */
    private void operatorOptions()
    {
        Scanner inputScanner = new Scanner(System.in);
        boolean isValidOption = true;
        boolean isNotFinished = true;
        String input = "";

        while (isValidOption && isNotFinished)
        {
            System.out.println("[A]Restock Items\n[B]Withdraw/Reset Money\n[C]Show Machine Data\n[D]Exit Admin Mode");
            System.out.println("What would you like to do?: ");

            input = inputScanner.nextLine().toUpperCase();
            switch (input)
            {
                case "A":
                    operatorControl.restockItems(productControl);
                    System.out.println("All items have been restocked!");
                    break;
                case "B":
                    operatorControl.withdrawMoney(currencyControl);
                    System.out.println("All money has been withdrawn and reset for the machine!");
                    break;
                case "C":
                    operatorControl.showMachineData(currencyControl, productControl);
                    break;
                case "D":
                    isNotFinished = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    isValidOption = true;
            }
        }
    }
}