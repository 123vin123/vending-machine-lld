package org.lld.paymentStrategy;

public interface CardPaymentStrategy extends PaymentStrategy {
    void validateCardExpiry();
}
