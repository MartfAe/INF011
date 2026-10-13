public class PixCreator extends PaymentCreator {

    @Override 
    public PaymentMethod createPaymentMethod(){
        return new PixPayment();
    }


}
