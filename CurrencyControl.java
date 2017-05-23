/**
 * CurrencyControl.java - SEP-25-2016 - ITEC 324: Project 1 -
 * This class contains all of the methods that control and manipulate the currency related to the program.
 * @author Tre Haga
 * @version 1.0
 */
public class CurrencyControl
{
    /**
     * The VendingMachine class instance variables.
     * Declares two doubles, customerBalance and machineBalance.
     */
    private double customerBalance, machineBalance;
    /**
     * The CurrencyControl class constructor.
     * Initializes the customerBalance and machineBalance instance variables.
     */
    public CurrencyControl()
    {
        customerBalance = 0.00;
        machineBalance = 50.00;
    }
    /**
     * The getCustomerBalance method returns this instance of the customerBalance.
     * @return customerBalance
     */
    public double getCustomerBalance()
    {
        return customerBalance;
    }
    /**
     * The getMachineBalance method returns this instance of the machineBalance.
     * @return machineBalance
     */
    public double getMachineBalance()
    {
        return machineBalance;
    }
    /**
     * The setCustomerBalance method takes in a new name value and sets the existing name variable to the new value.
     * @param money
     */
    public void setCustomerBalance(double money)
    {
        customerBalance = money;
    }
    /**
     * The setMachineBalance method takes in a new name value and sets the existing name variable to the new value.
     * @param money
     */
    public void setMachineBalance(double money)
    {
        machineBalance = money;
    }
    /**
     * The checkFunds method takes in two double variables and checks if the user has enough money to pay for an item.
     * @param money
     * @param itemPrice
     * @return insufficientFunds
     */
    public boolean checkFunds(double money, double itemPrice)
    {
        boolean insufficientFunds = false;
        if (money < itemPrice)
        {
            insufficientFunds = true;
        }
        return insufficientFunds;
    }
    /**
     * The calculateChange method takes in two double variables and calculates the difference between the user's
     * balance and the item's cost and returns the current balance for the user. It adds the cost of the item to
     * the current balance for the machine.
     * @param money
     * @param itemPrice
     * @return change
     */
    public double calculateChange(double money, double itemPrice)
    {
        double change = 0.00;
        customerBalance = customerBalance - itemPrice;
        machineBalance += itemPrice;
        change = customerBalance;
        return change;
    }
}
