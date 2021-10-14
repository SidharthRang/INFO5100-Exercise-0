package exercise1;
public class Television {
    int weight = 43, height = 1, length = 1, width = 1, price = 200;
    String brand = "Samsung", model = "SP Series", resolution = "4K";

    public Television(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println(
                "The Television is made by " + brand + ". The model is " + model + " and price is" + price);
    }

    public void On() {
    }

    public void Off() {
    }

    public void SwitchChannel() {
    }
}
