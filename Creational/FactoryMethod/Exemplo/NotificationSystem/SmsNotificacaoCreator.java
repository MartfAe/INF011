public class SmsNotificacaoCreator extends NotificacaoCreator{
    @Override
    public Notificacao criarNotificacao(){
        return new NotificacaoSms();
    }

}
