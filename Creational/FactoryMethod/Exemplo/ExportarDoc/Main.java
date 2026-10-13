public class Main {
    public static void main(String[] args) {
        CreatorDocument creator = new PDFCreator();
        creator.processDocument();
        System.out.println("-------------------------------------------------");

        creator = new WordCreator();
        creator.processDocument();
        System.out.println("-------------------------------------------------");
    }
}
