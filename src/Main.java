public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Chung ta khhong thuc ve nhau", "bai nay hay", "12345", 23.5f, 10);
        Book book = new Book("Dune 1", "Khoa hoc vien tuong", "23456", 50.5f, "huy", 400, "Khoa hoc vien tuong");
        mp3.showInfo();
        System.out.println();
        book.showInfo();
    }
}
