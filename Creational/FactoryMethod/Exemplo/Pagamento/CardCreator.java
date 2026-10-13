public class CardCreator extends PaymentCreator{

    @Override
    public PaymentMethod createPaymentMethod(){
        return new CardPayment();
    }

}
