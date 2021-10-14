package exercise1;
public class Window {
    String material = "Glass", type = "sliding", direction = "vertical";
    int height = 1, width = 1, length = 1;
    boolean hasLock = true, hasHandle = true;

    public Window(String type, String direction, boolean hasLock) {
        this.type = type;
        this.direction = direction;
        this.hasLock = hasLock;
        System.out.println("The window is a " + type + " type. It opens in " + direction + " direction and has"
                + (hasLock ? "a lock" : "no lock"));
    }

    public void Open() {

    }

    public void Close() {

    }

    public void Lock() {

    }
}
