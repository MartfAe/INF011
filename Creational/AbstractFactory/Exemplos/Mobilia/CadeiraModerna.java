public class CadeiraModerna implements Cadeira{
    @Override 
    public void temPerna(){
        System.out.println("Cadeira moderna tem 2 pés");
    }

    @Override 
    public void sentar(){
        System.out.println("Você está sentando em uma cadeira moderna");
    }
}
