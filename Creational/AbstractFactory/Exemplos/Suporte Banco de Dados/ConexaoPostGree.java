
public class ConexaoPostGree implements ConexaoDB {

    @Override 
    public void abrir(){
        System.out.println("Abrindo no PostGree");
    }

    @Override 
    public void fechar(){
        System.out.println("fechando o postgree");
    }

}
