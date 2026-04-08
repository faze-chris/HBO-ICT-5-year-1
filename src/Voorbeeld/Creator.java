package Voorbeeld;

public abstract class Creator {

    public abstract Product factoryMethod();

    public void anOperation() {
        Product product = factoryMethod();
        product.operation();
    }
}
