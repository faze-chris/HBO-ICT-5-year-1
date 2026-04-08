package Opdracht;

public class ApplePayPaymentCreator extends PaymentCreator {
    @Override
    public Payment createPayment() {
        return new ApplePayment();
    }

}
