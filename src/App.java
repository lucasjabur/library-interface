public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        new BookInterface(library);
    }
}
