/**
 * ProductControl.java - SEP-25-2016 - ITEC 324: Project 1 -
 * This class contains all of the methods that control and manipulate the products related to the program.
 * @author Tre Haga
 * @version 1.0
 */
public class ProductControl
{
    /**
     * The ProductControl class instance variables.
     * Declares four doubles: gumPrice, candyBarPrice, sodaPrice, and chipPrice.
     * Declares four integers: gumStock, candyBarStock, sodaStock, and chipsStock.
     */
    private double gumPrice, candyBarPrice, sodaPrice, chipsPrice;
    private int gumStock, candyBarStock, sodaStock, chipsStock;
    /**
     * The ProductControl class constructor.
     * Initializes the  gumPrice, candyBarPrice, sodaPrice, chipPrice,gumStock, candyBarStock, sodaStock, and
     * chipsStock instance variables.
     */
    public ProductControl()
    {
        gumPrice = 0.75;
        candyBarPrice = 1.00;
        sodaPrice = 1.25;
        chipsPrice = 1.50;
        gumStock = 10;
        candyBarStock = 10;
        sodaStock = 10;
        chipsStock = 10;
    }
    /**
     * The getGumPrice method returns this instance of gumPrice.
     * @return gumPrice
     */
    public double getGumPrice()
    {
        return gumPrice;
    }
    /**
     * The getCandyBarPrice method returns this instance of candyBarPrice.
     * @return candyBarPrice
     */
    public double getCandyBarPrice()
    {
        return candyBarPrice;
    }
    /**
     * The getSodaPrice method returns this instance of sodaPrice.
     * @return sodaPrice
     */
    public double getSodaPrice()
    {
        return sodaPrice;
    }
    /**
     * The getChipsPrice method returns this instance of chipsPrice.
     * @return chipsPrice
     */
    public double getChipsPrice()
    {
        return chipsPrice;
    }
    /**
     * The getGumStock method returns this instance of gumStock.
     * @return gumStock
     */
    public int getGumStock()
    {
        return gumStock;
    }
    /**
     * The getCandyBarStock method returns this instance of candyBarStock.
     * @return candyBarStock
     */
    public int getCandyBarStock()
    {
        return candyBarStock;
    }
    /**
     * The getsodaStock method returns this instance of sodaStock.
     * @return sodaStock
     */
    public int getSodaStock()
    {
        return sodaStock;
    }
    /**
     * The getChipsStock method returns this instance of chipsStock.
     * @return chipStock
     */
    public int getChipsStock()
    {
        return chipsStock;
    }
    /**
     * The setGumStock method takes in a new name value and sets the existing name variable to the new value.
     * @param newGumStock
     */
    public void setGumStock(int newGumStock)
    {
        gumStock = newGumStock;
    }
    /**
     * The setCandyBarStock method takes in a new name value and sets the existing name variable to the new value.
     * @param newCandyBarStock
     */
    public void setCandyBarStock(int newCandyBarStock)
    {
        candyBarStock = newCandyBarStock;
    }
    /**
     * The setSodaStock method takes in a new name value and sets the existing name variable to the new value.
     * @param newSodaStock
     */
    public void setSodaStock(int newSodaStock)
    {
        sodaStock = newSodaStock;
    }
    /**
     * The setChipsStock method takes in a new name value and sets the existing name variable to the new value.
     * @param newChipsStock
     */
    public void setChipsStock(int newChipsStock)
    {
        chipsStock = newChipsStock;
    }
}
