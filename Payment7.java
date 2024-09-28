// 7. Design an online payment system with a Payment interface that includes a method processPayment(double amount). Implement CreditCardPayment and PayPalPayment classes that process payments differently and display confirmation.

interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment of $" + amount + " processed.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment of $" + amount + " processed.");
    }
}

public class Payment7 {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.processPayment(250.00);

        payment = new PayPalPayment();
        payment.processPayment(150.00);
    }
}
