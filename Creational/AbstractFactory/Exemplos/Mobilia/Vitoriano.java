public class Vitoriano implements Cadeira, Mesa {

    @Override
    public void temPerna(){
        System.out.println("A cadeira vitoriana tem 4 pernas");
    }

    @Override
    public void sentar(){
        System.out.println("Você está sentado em uma cadeira vitoriana");
    }

    @Override 
    public void colocarObjeto(){
        System.out.println("Você está colocando um objeto em uma mesa vitoriana");
    }

}
