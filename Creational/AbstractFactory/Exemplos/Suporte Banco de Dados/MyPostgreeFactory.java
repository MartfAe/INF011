public class MyPostgreeFactory implements DBFFactory {
    @Override
    public ConexaoDB novaConexao(){
        return new ConexaoPostGree();
    }

    @Override 
    public ComandoSQL novoComando(){
        return new ComandoPostGreeSql();
    }
}
