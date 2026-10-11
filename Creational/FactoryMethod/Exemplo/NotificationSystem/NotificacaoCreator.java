public abstract class NotificacaoCreator {
    public abstract Notificacao criarNotificacao();

    public void enviarAlerta(String mensage){
        Notificacao notificacao = criarNotificacao();
        notificacao.send(mensage);

    }

}
