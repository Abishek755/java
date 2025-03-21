//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Car{

    int price;
    Car(int price){
        this.price = price;
    }
    public void price(){
       System.out.println("Price :" + price );
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car(20000);
        c.price();
    }
}
