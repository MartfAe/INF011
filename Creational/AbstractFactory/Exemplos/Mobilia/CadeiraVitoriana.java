public class CadeiraVitoriana implements Cadeira {
    @Override
    public void temPerna(){
        System.out.println("Essa cadeira vitoriana tem 4 pernas");
    }

    @Override 
    public void sentar(){
        System.out.println("Você está sentando em uma cadeira vitoriana.");
    }
}
