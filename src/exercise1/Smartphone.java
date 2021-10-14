package exercise1;
public class Smartphone {

    int battery_power = 5000, height = 1, length = 1, width = 1, price = 230;
    String operatingSystem = "Android", brand = "Samsung", model = "A32";

    public Smartphone(String operatingSystem, String brand, int price) {
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.price = price;
        System.out.println("The Smartphone is made by " + brand + ". The operating system is " + operatingSystem
                + " and price is" + price);
    }

    public void On() {
    }

    public void Off() {
    }

    public void StartApp() {
    }
}
