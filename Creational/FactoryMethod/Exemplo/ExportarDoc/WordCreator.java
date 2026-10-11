public class WordCreator extends CreatorDocument {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
