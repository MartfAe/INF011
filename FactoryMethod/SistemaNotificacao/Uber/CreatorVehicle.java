
public abstract class CreatorVehicle{

    public abstract Vehicle criarVeiculo();

    public void executarViagem(){
        Vehicle vehicle = this.criarVeiculo();
        System.out.println("Iniciando viagem para até: " +vehicle.qtdPassageiro +" passageiros...");
        vehicle.acelerar();
        
    }
}