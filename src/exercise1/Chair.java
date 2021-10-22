package exercise1;
public class Chair {
    int NumOfLegs = 4, height = 1, width = 1, length = 1, price = 15;
    String material = "Metal";
    boolean hasWheels = true, adjustableHeight = true, isFoldable = true;

    public Chair(String material, boolean hasWheels, boolean isFoldable, boolean hasDesk, boolean hasCushion) {
        this.material = material;
        this.hasWheels = hasWheels;
        this.isFoldable = isFoldable;
        System.out.println("The chair is made of " + material + ". It is "
                + (isFoldable ? "foldable" : "not foldable") + " with " + (hasWheels ? "wheels" : "no wheels"));
        new ArmRest(hasDesk, hasCushion);
    }

    public class ArmRest {
        String material = "metal", color = "black";
        boolean hasDesk = false, isRetractable = true, hasCushion = false;
        int height = 1, width = 1, length = 1;

        public ArmRest(boolean hasDesk, boolean hasCushion) {
            this.hasDesk = hasDesk;
            this.hasCushion = hasCushion;
            System.out.println("The Armrest has " + (hasDesk ? "a desk" : "no desk") + ".It has "
                    + (hasCushion ? "a cushion" : "no cushion"));
        }

        public void Expand() {
        }

        public void Collapse() {
        }

        public void OpenDesk() {
        }
    }

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
    
    public void AdjustHeight() {
    }

    public void moveChair() {
    }

    public void Fold() {
    }

}