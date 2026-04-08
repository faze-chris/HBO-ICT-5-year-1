package VoorbeeldNaOpdracht;

public class CreditCardPayment implements Payment {

    @Override
    public boolean authorize(double amount) {
        System.out.println("Checking credit card details...");
        System.out.println("Reserving €" + amount + " on the credit card.");
        return true;
    }

    @Override
    public void capture(double amount) {
        System.out.println("Capturing €" + amount + " from the credit card.");
    }

    @Override
    public String getPaymentName() {
        return "Credit Card";
    }
}