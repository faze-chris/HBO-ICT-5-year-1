package Opdracht;

public class CreditCardPayment implements Payment {

    @Override
    public void authorizePayment() {
        System.out.println("Authorizing payment with Credit Card.");
    }
}