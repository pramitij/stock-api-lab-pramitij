package edu.neu.csye7374;

/**
 * @author PramithiJagdish
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //Add your code in between these two print statements
        StockMarket stock_market = StockMarket.getInstance();
        //stock_market.tradeStocks();
        stock_market.updatedTradeStocks();

        System.out.println("\n\n============Main Execution End===================");
    }
}
