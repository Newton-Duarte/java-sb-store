package com.newtonduarte.store;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("amount: " + amount);
    }
}
