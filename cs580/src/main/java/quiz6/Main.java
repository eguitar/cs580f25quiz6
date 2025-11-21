package quiz6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("AMD", 203.78);

        StockTrader trader1 = new StockTrader("Zach Tran", "AMD");
        StockTrader trader2 = new StockTrader("Viet Nguyen", "AMD");
        StockTrader trader3 = new StockTrader("Johnathan Ko", "AMD");

        stock.addTrader(trader1);
        stock.addTrader(trader2);
        stock.addTrader(trader3);

        Random random = new Random();
        double currentPrice = stock.getPrice();

        for (int i = 0; i < 3; i++) {
            double change = (random.nextDouble() * 20) - 10;
            System.out.println("---------------------------------------------");
            System.out.print("Old Price: " + currentPrice + " ------- New Price: ");
            currentPrice = Math.round((currentPrice + change) * 100.0) / 100.0;
            System.out.println(currentPrice);
            System.out.println("---------------------------------------------");
            stock.setPrice(currentPrice);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}