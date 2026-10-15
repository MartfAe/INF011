public class Main {

    public static void main(String[] args){
        System.out.println("Moveis Vitorianos");
        MobiliaFactory  factory= new VitorianaFactory();
        Mesa mesa = factory.novaMesa(); 
        Cadeira cadeira = factory.novaCadeira();
        mesa.colocarObjeto();
        cadeira.temPerna();
        cadeira.sentar();

        System.out.println("-------------------------------");

        System.out.println("Moveis modernos");
        factory = new ModernaFactory();
        mesa = factory.novaMesa();
        cadeira = factory.novaCadeira();
        cadeira.temPerna();
        cadeira.sentar();
        mesa.colocarObjeto();

    }

}
