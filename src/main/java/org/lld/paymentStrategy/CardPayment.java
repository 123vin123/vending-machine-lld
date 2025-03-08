package org.lld.paymentStrategy;

public class CardPayment implements CardPaymentStrategy{

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

    }

    @Override
    public void processPayment(double amount) {
        balance -= amount;

    }

    @Override
    public void validateCardExpiry() {
        System.out.println("It is not expired");
    }
}
