package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

    private List<Tradable> ListStocks = new ArrayList<>();

    private static StockMarket instance;

    private StockMarket() {
        instance = null;

    }
    public static synchronized StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }
    //Add Stock
    public void addStock(Tradable someStock) {
        ListStocks.add(someStock);
        System.out.println("Added stock: "+someStock.getName());

    }
    //Remove Stock objects
    public void removeStock(Tradable someStock) {
        ListStocks.remove(someStock);
        System.out.println("Removed stock: "+someStock.getName());
    }

    //Trade Stock objects (calculate new Stock price based on current price, bid and metric)
    public void tradeStocks() {
        Tradable stock1 = new Apple("apple", 123.54, "Apple Inc. Stock");
        Tradable stock2 = new Netflix("netflix", 123.54, "Netflix Inc. Stock");

        addStock(stock1);
        addStock(stock2);
        showStocks();
        stock2.setBid(655.87);
        showStocks();
        stock2.setBid(678.87);
        showStocks();
        stock2.setBid(655.87);
        showStocks();
        stock2.setBid(688.87);
        showStocks();
        removeStock(stock1);
        showStocks();
        stock2.setBid(655.87);
        showStocks();
    }

    public void updatedTradeStocks() {

        Tradable stock3 = AbstractFactoryApple.getInstance().getObject();
        Tradable stock4 = AbstractFactoryNetflix.getInstance().getObject();
        stock3.setName("NewApple");
        stock3.setPrice(644.03);
        stock3.setDesc("Stock created with abstract class");
        stock4.setName("NewNetflix");
        stock4.setPrice(414.03);
        stock4.setDesc("Stock created with abstract class");
        addStock(stock3);
        addStock(stock4);
        showStocks();
        stock4.setBid(655.87);
        showStocks();
        stock4.setBid(678.87);
        showStocks();
        stock4.setBid(688.87);
        showStocks();
        stock4.setBid(688.87);
        showStocks();
        stock4.setBid(688.87);
        showStocks();
    }

    //Show all stocks traded on this market (e.g., Stock state like price, metric, etc.)
    public void showStocks() {
        System.out.println("\nList: \n");
        for(int i = 0; i<ListStocks.size();i++) {
            System.out.println(ListStocks.get(i));
        }

    }

}
