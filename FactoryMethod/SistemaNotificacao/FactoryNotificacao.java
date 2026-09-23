public abstract class FactoryNotificacao {
    public abstract Notificacao criarNotificacao();
    
    public void executarEnvio(){
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
