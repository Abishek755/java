package Java.work;  

public class FruitsDetails {

    // Method Overloading: Different ways to display fruit details
   
    void fruit(String name, String color, double price) {
        System.out.println("Fruit name: " + name + ", Color: " + color + ", Price: $" + price);
    }

    public static void main(String[] args) {
        FruitsDetails shop = new FruitsDetails();
        shop.fruit("Mango", "Orange", 1.99);
        shop.fruit("Grapes", "Purple", 2.49);
        shop.fruit("Watermelon", "Green", 4.99);
        shop.fruit("Strawberry", "Red", 3.25);
        shop.fruit("Blueberry", "Blue", 5.99);
        shop.fruit("Pineapple", "Brown-Yellow", 3.75);
    }
}
