public class WindowsFactory implements UIFactory {
    @Override
    public Botao criarBotao(){
        return new BotaoWindows();
    }

    @Override 
    public Menu criarMenu(){
        return new MenuWindows();
    }
}
