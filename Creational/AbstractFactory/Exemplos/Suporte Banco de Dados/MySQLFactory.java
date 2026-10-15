
public class MySQLFactory implements DBFFactory {

    @Override
    public ConexaoDB novaConexao(){
        return new ConexaoMySql();
    }

    @Override
    public ComandoSQL novoComando(){
        return new ComandoMySql();
    }

}
