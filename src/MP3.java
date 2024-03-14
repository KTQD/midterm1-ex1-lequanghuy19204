public class MP3 extends Item {
    private int duration;
    public MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }
    @Override
    void showInfo() {
        System.out.println("Thong tin MP3:");
        System.out.println("Ten: " + name);
        System.out.println("Mieu ta bai hat: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Gia: " + price);
        System.out.println("Thoi gian: " + duration + " phut");
    }
}
