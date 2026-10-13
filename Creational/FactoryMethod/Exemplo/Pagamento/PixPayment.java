public class PixPayment implements PaymentMethod {

    @Override 
    public double calculateTaxa(double value){
        return value +(value * 0.00);
    }


    @Override
    public void processPayment(double value){
        System.out.println("Processando pagamento via Pix no valor de: " + value);
    }


}
