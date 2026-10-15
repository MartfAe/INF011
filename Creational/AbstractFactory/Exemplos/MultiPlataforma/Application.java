public class Application {
    private UIFactory factory;

    public Application(UIFactory factory){
        this.factory = factory;
    }

    public void renderizarUI(){
       Botao botao = factory.criarBotao();
       Menu menu = factory.criarMenu();
       botao.desenhar();
    menu.renderizar();
    }

}
