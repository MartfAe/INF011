public class ComandoMySql implements ComandoSQL{

    @Override 
    public void executar(String query){
        System.out.println("Executando query:" + query);
    }

}
