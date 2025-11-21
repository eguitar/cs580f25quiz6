package quiz6;

import java.util.ArrayList;

public class Stock {
    private String symbol;
    private double price;
    private ArrayList<Observer> observers;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void addTrader(Observer observer) { observers.add(observer); }

    public void setPrice(double price) {
        if (this.price != price) {
            this.price = price;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(symbol, price);
        }
    }
}