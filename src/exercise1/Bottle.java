package exercise1;
public class Bottle {
    String material = "Plastic", color = "blue";
    boolean isSealed = false, isEmpty = true;
    int height = 1, width = 1, volume = 500, price = 2;

    public Bottle(String material, int volume, int price, boolean isEmpty) {
        this.material = material;
        this.volume = volume;
        this.price = price;
        this.isEmpty = isEmpty;
        System.out.println("The bottle is made of " + material + " and has a volume of " + volume
                + " ml. The bottle is " + (this.isEmpty ? "empty" : "full"));
    }

    public void Fill() {
    }

    public void Empty() {
    }

    public void Open() {
    }

    public void Close() {
    }
}