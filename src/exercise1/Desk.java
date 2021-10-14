package exercise1;
public class Desk {
    String material = "wood", shape = "rectangular", color = "Brown";
    int height = 1, width = 1, length = 1, price = 25, NumOfLegs = 4;
    boolean hasDrawer = true, isFoldable = true;

    public Desk(String material, boolean hasDrawer, boolean isFoldable, int price) {
        this.material = material;
        this.hasDrawer = hasDrawer;
        this.isFoldable = isFoldable;
        this.price = price;
        System.out.println("The Desk is made of " + material + ". It has " + (hasDrawer ? "a drawer" : "no drawers")
                + " and is " + (isFoldable ? "foldable" : "not foldable"));
    }

    public void OpenDrawer() {
    }

    public void CloseDrawer() {
    }

    public void Fold() {
    }
}
