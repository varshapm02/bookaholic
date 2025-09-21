package com.library.payments;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private List<Payment> payments = new ArrayList<Payment>();

    public void processPayment(Payment payment) {
        payments.add(payment);
        System.out.println("Payment processed successfully.");
        payment.displayPayment();
    }

    public void displayAllPayments() {
        System.out.println("\n--- All Payments ---");
        for (Payment p : payments) {
            p.displayPayment();
        }
    }
}
