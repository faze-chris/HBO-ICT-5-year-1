package Opdracht;

public class IdealPaymentCreator extends PaymentCreator {

    @Override
    public Payment createPayment() {
        return new IdealPayment();
    }
}