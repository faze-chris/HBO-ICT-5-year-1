package VoorbeeldNaOpdracht;

public interface Payment {
    boolean authorize(double amount);

    void capture(double amount);

    String getPaymentName();
}