public class Application {
    private Botao botao;
    private Menu menu;

    public Application(UIFactory factory){
        botao = factory.criarBotao();
        menu = factory.criarMenu();
    }

    public void renderizarUI(){
        botao.desenhar();
        menu.renderizar();
    }
}
