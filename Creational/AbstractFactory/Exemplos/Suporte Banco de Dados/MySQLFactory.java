
public class MySQLFactory implements DBFFactory {

    @Override
    public void ConexaoDB novaConexao(){
        System.out.println("Nova conexão no mysql");
    }

    @Override
    public void ComandoSQL novoComando(){
        System.out.println("Novo comando no MySQL");
    }

}
