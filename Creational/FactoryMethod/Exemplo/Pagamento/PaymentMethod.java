public interface PaymentMethod {
    double calculateTaxa(double value);

    void processPayment(double value);

    

}
