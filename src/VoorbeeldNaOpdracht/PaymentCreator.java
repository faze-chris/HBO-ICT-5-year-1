package VoorbeeldNaOpdracht;

public abstract class PaymentCreator {

    // Factory Method
    protected abstract Payment createPayment();

    // Shared algorithm
    public void checkout(double amount) {
        System.out.println("Starting checkout...");
        validateAmount(amount);

        Payment payment = createPayment();
        System.out.println("Selected payment method: " + payment.getPaymentName());

        boolean authorized = payment.authorize(amount);
        if (!authorized) {
            System.out.println("Payment authorization failed.");
            return;
        }

        payment.capture(amount);
        sendConfirmation();

        System.out.println("Checkout completed successfully.\n");
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
    }

    private void sendConfirmation() {
        System.out.println("Sending payment confirmation to customer...");
    }
}