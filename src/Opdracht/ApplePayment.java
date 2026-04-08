package Opdracht;

public class ApplePayment implements Payment {
    @Override
    public void authorizePayment() {
        System.out.println("Authorizing payment with apple payment.");
    }
}


