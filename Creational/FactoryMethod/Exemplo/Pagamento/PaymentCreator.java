public abstract class PaymentCreator {

    public abstract PaymentMethod createPaymentMethod();

    public void executePayment(double value){
        PaymentMethod paymentMethod = createPaymentMethod();
        paymentMethod.calculateTaxa(value);
        paymentMethod.processPayment(value);
    }


}
