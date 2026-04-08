package Opdracht;

public abstract class PaymentCreator {

    public abstract Payment createPayment();

    public void processCheckout() {
        Payment payment = createPayment();
        payment.authorizePayment();
    }
}