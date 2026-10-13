public class CardPayment implements PaymentMethod{

    @Override
    public double calculateTaxa(double value){
        return value +(value * 0.05);
    }

    @Override 
    public void processPayment(double value){
        System.out.println("Processando pagamento via Cartão no valor de: " + value);
    }

}
