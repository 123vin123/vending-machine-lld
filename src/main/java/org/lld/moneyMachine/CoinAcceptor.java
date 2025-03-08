package org.lld.moneyMachine;

import org.lld.paymentStrategy.PaymentStrategy;

public class CoinAcceptor {

    public void acceptCoin(double amount , PaymentStrategy paymentStrategy){
        paymentStrategy.addAmount(amount);
    }
}
