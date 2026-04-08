package VoorbeeldNaOpdracht;

public class IdealPayment implements Payment {

    @Override
    public boolean authorize(double amount) {
        System.out.println("Redirecting customer to iDEAL bank portal...");
        System.out.println("Approving iDEAL payment of €" + amount + ".");
        return true;
    }

    @Override
    public void capture(double amount) {
        System.out.println("Finalizing iDEAL payment of €" + amount + ".");
    }

    @Override
    public String getPaymentName() {
        return "iDEAL";
    }
}