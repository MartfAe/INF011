public abstract class CreatorDocument {

    public abstract Document createDocument();

    public void processDocument(){
        Document document = createDocument();
        document.abrir();
        document.fechar();
    }

}
