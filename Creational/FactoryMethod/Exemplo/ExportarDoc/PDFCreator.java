public class PDFCreator extends CreatorDocument {
    @Override
    public Document createDocument(){
        return new PDFDocument();
    }
}
