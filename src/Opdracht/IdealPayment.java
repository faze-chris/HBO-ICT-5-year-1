package Opdracht;

public class IdealPayment implements Payment {

    @Override
    public void authorizePayment() {
        System.out.println("Authorizing payment with iDEAL.");
    }
}