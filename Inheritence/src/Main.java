
class Vehicle{
    public void display(){
        System.out.println("I am a Vehicle.");
    }
}

class Car1 extends Vehicle{
    String cname = "BMW";
    int cprice = 20000;
    public void cardetails() {
        System.out.println("I am a" + cname + " I am Priced At");
    }
}

class Car2 extends Vehicle{
    String cname = "BMW";
    int cprice = 20000;
    public void cardetails() {
        System.out.println("I am a" + cname + " I am Priced At");
    }
}

public class Main {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        Car2 c2 = new Car2();
        System.out.println();
    }
}