package org.lld.paymentStrategy;

public interface PaymentStrategy {

      void addAmount(double amount);
      double getBalance();
      void resetBalance();
      void processPayment(double amount);

}
