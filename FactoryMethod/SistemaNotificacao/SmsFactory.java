public class SmsFactory extends FactoryNotificacao {

    @Override 
    public Notificacao criarNotificacao(){
        return new NotificacaoSms();
    }

}
