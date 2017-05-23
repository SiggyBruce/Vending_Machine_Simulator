/**
 * Driver.java - SEP-25-2016 - ITEC 324: Project 1 -
 * This class contains the main method for starting the program.
 * @author Tre Haga
 * @version 1.0
 */
public class Driver
{
    /**
     * The main method that drives the program. Calls the VendingMachine class to start the program.
     * @param args - Takes in command line arguments.
     */
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.start();
    }
}
