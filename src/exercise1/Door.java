package exercise1;
public class Door {
    String material = "Wood", color = "Brown";
    int height = 1, width = 1, length = 1, price = 25;
    boolean hasLock = true, isSoundProof = false;

    public Door(String material, String color) {
        this.material = material;
        this.color = color;
        System.out.println("The Door is made of " + material + ". The color of the door is " + color);
    }

    public void Open() {

    }

    public void Close() {

    }

    public void Lock() {

    }
}
