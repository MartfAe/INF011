public class ModernaFactory implements MobiliaFactory{

    @Override 
    public Cadeira novaCadeira(){
        return new CadeiraModerna();
    }

    @Override 
    public Mesa novaMesa(){
        return new MesaModerna();
    }

}
