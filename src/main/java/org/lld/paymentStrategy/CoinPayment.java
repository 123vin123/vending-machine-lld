package org.lld.paymentStrategy;

public class CoinPayment implements PaymentStrategy{

private double balance = 0;
    @Override
    public void addAmount(double amount) {
           balance += amount;
    }

    @Override
    public double getBalance() {
       return balance;
    }

    @Override
    public void resetBalance() {
         balance = 0;
    }

    @Override
    public void processPayment(double amount) {
             balance -= amount;
    }
}
