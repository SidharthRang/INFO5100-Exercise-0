package exercise1;
public class WaterPitcher {
    String material = "Plastic", color = "white";
    int height = 1, width = 1, length = 1, volume = 100, price = 15;
    boolean hasFilter = true;

    public WaterPitcher(int volume, int price, boolean hasFilter) {
        this.volume = volume;
        this.price = price;
        this.hasFilter = hasFilter;
        System.out.println("WaterPitcher has a volume of " + volume
                + "ml. Its price is " + price);
    }

    public void Fill() {
    }

    public void Empty() {
    }

    public void Filter() {
    }
}