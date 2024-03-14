public class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;

    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    void showInfo() {
        System.out.println("Thong tin sach:");
        System.out.println("Ten: " + name);
        System.out.println("Mieu ta sach: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Gia: " + price);
        System.out.println("Tac gia: " + author);
        System.out.println("So trang: " + numberOfPages);
        System.out.println("The loai: " + genre);
    }
}
