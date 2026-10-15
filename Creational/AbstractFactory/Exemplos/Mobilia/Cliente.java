public class Cliente {

    private Cadeira cadeira;
    private Mesa mesa;

    public Cliente(MobiliaFactory factory){
        cadeira = factory.novaCadeira();
        mesa = factory.novaMesa();
    }

    public void mobiliar(){
        cadeira.temPerna();
        cadeira.sentar();
        mesa.colocarObjeto();
    }

}
