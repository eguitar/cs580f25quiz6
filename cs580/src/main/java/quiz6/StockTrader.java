package quiz6;

public class StockTrader implements Observer {
    private String name;
    private String symbol;
    private double price;
    
    public StockTrader(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.price = -1;
    }

    @Override
    public void update(String symbol, double price) {
        String output = "Stock Trader Name: " + this.name + "\n" +
                        "Stock Observing: " + this.symbol + "\n" + 
                        "Current Price: " + price + "\n";

        if (this.price == -1) { output += "Initial price set"; }
        else if (price > this.price) { output += "The price went up."; }
        else if (price < this.price) { output += "The price went down."; }
        else { output += "The price stayed the same."; }

        System.out.println(output);
        this.price = price;
    }
}