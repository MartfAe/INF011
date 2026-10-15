
public class ComandoPostGreeSql implements ComandoSQL {

    @Override 
    public void executar(String query){
        System.out.println("Executando no postGree a query:" +query);
    }

}
