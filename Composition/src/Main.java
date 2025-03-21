class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

class Car {
    private Engine engine; // Composition: Car has an Engine

    Car() {
        this.engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car is ready to drive!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
