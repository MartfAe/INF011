public class WordDocument implements Document{

    @Override
    public void abrir(){
        System.out.println("Abrindo Word");
    }

    @Override
    public void fechar(){
        System.out.println("Fechando Word");
    }

}
