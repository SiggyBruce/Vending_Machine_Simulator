import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 * Operator.java - SEP-25-2016 - ITEC 324: Project 1 -
 * This class contains all of the methods that control and manipulate the administrative related duties
 * with currency and/or products related to the program.
 * @author Tre Haga
 * @version 1.0
 */
public class Operator
{
    /**
     * The restockItems method resets the stock value for each product back to the default value of 10.
     * @param productControl
     */
    public void restockItems(ProductControl productControl)
    {
        productControl.setGumStock(10);
        productControl.setCandyBarStock(10);
        productControl.setSodaStock(10);
        productControl.setChipsStock(10);
    }
    /**
     * The withdrawMoney method takes all of the money accumulated by the user and resets the balance of
     * the machine back to the default of $50.
     * @param currencyControl
     */
    public void withdrawMoney(CurrencyControl currencyControl)
    {
        currencyControl.setMachineBalance(50.00);
    }
    /**
     * The showMachineData method shows a visual display of the current data related to the machine.
     * @param currencyControl
     * @param productControl
     */
    public void showMachineData(CurrencyControl currencyControl, ProductControl productControl)
    {
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        System.out.println("Current machine balance: $" + numberFormat.format(currencyControl.getMachineBalance()));
        System.out.println("Current items in stock");
        System.out.println("Gum: " + productControl.getGumStock());
        System.out.println("Candy Bar: " + productControl.getCandyBarStock());
        System.out.println("Soda: " + productControl.getSodaStock());
        System.out.println("Chips: " + productControl.getChipsStock());
    }
}
