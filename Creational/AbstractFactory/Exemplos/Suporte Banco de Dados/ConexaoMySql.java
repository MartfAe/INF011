public class ConexaoMySql implements ConexaoDB {
    @Override 
    public void abrir(){
        System.out.println("Abrindo...");

    }

    @Override 
    public void fechar(){
        System.out.println("Fechando...");
    }
}
