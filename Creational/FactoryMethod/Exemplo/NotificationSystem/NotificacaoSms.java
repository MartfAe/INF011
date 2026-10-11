public class NotificacaoSms implements Notificacao {

    @Override
    public void send(String mensage){
        System.out.println("SMS ENVIADO:" + mensage);
    }

}
