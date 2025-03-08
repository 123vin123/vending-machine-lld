package org.lld.cardReader;

import org.lld.paymentStrategy.PaymentStrategy;

public class CardReader {
    public void readCard(double amount, PaymentStrategy paymentStrategy){
        paymentStrategy.addAmount(amount);
    }
}
