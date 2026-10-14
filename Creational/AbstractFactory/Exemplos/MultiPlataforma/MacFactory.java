public class MacFactory implements UIFactory {
    @Override
    public Botao criarBotao(){
        return new BotaoMac();
    }

    @Override
    public Menu criarMenu(){
        return new MenuMac();
    }
}
