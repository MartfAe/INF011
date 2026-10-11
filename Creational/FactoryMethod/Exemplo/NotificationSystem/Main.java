public class Main {

    public static void main(String[] args){
        NotificacaoCreator notificacaoCreator = new SmsNotificacaoCreator();
        notificacaoCreator.enviarAlerta("Olá, você tem uma nova mensagem!");

        NotificacaoCreator notificacaoCreator2 = new EmailNotificacaoCreator();
        notificacaoCreator2.enviarAlerta("Olá, você tem uma nova mensagem!");
    }

}
