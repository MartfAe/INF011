public class VitorianaFactory implements MobiliaFactory{

    @Override
    public Cadeira novaCadeira(){
        return new CadeiraVitoriana();
    }

    @Override 
    public Mesa novaMesa(){
        return new MesaVitoriana();
    }

}
