//-------------------------------------------------------------
// VOORBEELD 1
import Voorbeeld.ConcreteCreatorA;
import Voorbeeld.ConcreteCreatorB;
import Voorbeeld.Creator;

//-------------------------------------------------------------
// OPDRACHT
// import Opdracht.CreditCardPaymentCreator;
// import Opdracht.IdealPaymentCreator;
// import Opdracht.PaymentCreator;

//-------------------------------------------------------------
// VOORBEELD 2
// import VoorbeeldNaOpdracht.CreditCardPaymentCreator;
// import VoorbeeldNaOpdracht.IdealPaymentCreator;
// import VoorbeeldNaOpdracht.PaymentCreator;

public class Main {
    public static void main(String[] args) throws Exception {
        //-------------------------------------------------------------
        // VOORBEELD 1
        Creator creatorA = new ConcreteCreatorA();
        creatorA.anOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.anOperation();

        //-------------------------------------------------------------
        // OPDRACHT
        // PaymentCreator idealCreator = new IdealPaymentCreator();
        // idealCreator.processCheckout();

        // PaymentCreator creditCardCreator = new CreditCardPaymentCreator();
        // creditCardCreator.processCheckout();

        // PaymentCreator applePayCreator = new ApplePayPaymentCreator();
        // applePayCreator.processCheckout();

        //-------------------------------------------------------------
        // VOORBEELD 2
        // PaymentCreator creditCardProcessor = new CreditCardPaymentCreator();
        // PaymentCreator idealProcessor = new IdealPaymentCreator();

        // creditCardProcessor.checkout(49.95);
        // idealProcessor.checkout(19.99);
    }
}
