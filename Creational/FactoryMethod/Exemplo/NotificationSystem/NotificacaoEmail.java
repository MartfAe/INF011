public class NotificacaoEmail implements Notificacao{

    @Override
    public void send(String mensage){
        System.out.println("E-mail enviado!" + mensage);
    }

}
