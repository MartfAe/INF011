public class NotificacaoEmail implements Notificacao{
    @Override 
    public void enviar(){
        System.out.println("Enviando notificacao por email!");
    }

}
