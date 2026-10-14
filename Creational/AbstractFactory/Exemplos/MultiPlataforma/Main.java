public class Main {

    public static void main(String[] args) {
        UIFactory factory = new WindowsFactory();
        Botao botao = factory.criarBotao();
        Menu menu = factory.criarMenu();

        botao.desenhar();
        menu.renderizar();

        factory = new MacFactory();
        botao = factory.criarBotao();
        menu = factory.criarMenu();

        botao.desenhar();
        menu.renderizar();
    }

}
