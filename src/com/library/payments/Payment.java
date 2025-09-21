package com.library.payments;

public class Payment {
        private String patronId;
        private double amount;
        private String type;  // Membership, Late Fee, Lost Book, etc.
        private String date;

        public Payment(String patronId, double amount, String type, String date) {
            this.patronId = patronId;
            this.amount = amount;
            this.type = type;
            this.date = date;
        }

        public String getPatronId() {
            return patronId;
        }

        public double getAmount() {
            return amount;
        }

        public String getType() {
            return type;
        }

        public String getDate() {
            return date;
        }

        public void displayPayment() {
            System.out.println("Payment by Patron ID: " + patronId +
                    ", Type: " + type +
                    ", Amount:  " + amount +
                    ", Date: " + date);
        }
}
