public class EmailFactory extends FactoryNotificacao {

    @Override 
    public Notificacao criarNotificacao(){
        return new NotificacaoEmail();
    }

}
