package Java;

abstract class Example { // abstract class

    abstract void sound(); // abstract method

}

class Exa extends Example { // child class
    @Override
    void sound() {
        System.out.println("sound makes noise"); // Corrected grammar
    }


}

class Ex1 extends Exa{
	@Override
	void sound() {
		System.out.println("sound2 makes noise");
	}
	
}
public class Abstraction {

    public static void main(String[] args) {
        Exa obj = new Exa();
        obj.sound();
        obj.sound();
    }
}