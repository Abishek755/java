package Java.work;
class Car{
	public void car1() {
		System.out.println("BMW");
	}
}
class Car1 extends Car{
	public void car2() {
		System.out.println("Car price:2000000");
	}
}

public class FinalKeyword_Work {

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.car1();
		c.car2();

	}

}
