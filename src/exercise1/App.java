package exercise1;

public class App {

    public static void main(String[] args) throws Exception {

        // Create 3 instances of Bottle
        new Bottle("plastic", 500, 10, true);
        new Bottle("Steel", 500, 20, true);
        new Bottle("Steel", 100, 15, true);

        // Create 3 instances of Chair and Armrest
        new Chair("Plastic", true, true, false, true);
        new Chair("Wood", false, false, false, false);
        new Chair("metal", false, false, true, false);

        // Create 3 instances of Desk
        new Desk("Wood", true, false, 20);
        new Desk("plastic", false, true, 10);
        new Desk("metal", true, false, 30);

        // Create 3 instances of Door
        new Door("Wood", "Brown");
        new Door("Metal", "Grey");
        new Door("fibreglass", "White");

        // Create 3 instances of Window
        new Window("Sliding", "Vertical", false);
        new Window("Sliding", "Horizontal", true);
        new Window("Opening", "Vertical", true);

        // Create 3 instances of WaterPitcher
        new WaterPitcher(500, 5, false);
        new WaterPitcher(600, 6, true);
        new WaterPitcher(700, 7, true);

        // Create 3 instances of Computer
        new Computer("Windows", "HP", 500);
        new Computer("Macintosh", "Apple", 1000);
        new Computer("Linux", "Dell", 400);

        // Create 3 instances of Smartphone
        new Smartphone("Android", "Samsung",200);
        new Smartphone("iOS", "Apple",400);
        new Smartphone("Android", "Motorola",250);

        // Create 3 instances of Television
        new Television("Sony", "Bravia", 1200);
        new Television("Samsung", "Q70A", 1000);
        new Television("LG","CX Series", 1800);

    }
}
