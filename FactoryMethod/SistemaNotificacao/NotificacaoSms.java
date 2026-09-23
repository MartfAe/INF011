public class NotificacaoSms implements Notificacao {
    @Override
    public void enviar(){
        System.out.println("Enviando notificação por SMS");
    }
}
