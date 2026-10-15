public class Application {
    private DBFFactory factory;

    public Application(DBFFactory factory){
        this.factory = factory;
    }

  public void executar(String query){
    ConexaoDB conexao = factory.novaConexao();
    ComandoSQL comando = factory.novoComando();

    conexao.abrir();
    comando.executar(query);
    conexao.fechar();
  }
}
