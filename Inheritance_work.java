package Java.work;


class Animal{
	public void Animal_method()
	{
		System.out.println("I AM AN ANIMAL");
	}
}

class DOG extends Animal{
	public void DOG_Method(){
		System.out.println("BOW BOW");
	}
}

class CAT extends DOG{
	public void CAT_Method(){
		System.out.println("MEOW MEOW");
	}
}
public class Inheritance_work {

	public static void main(String[] args)
	{
		DOG D = new DOG();
		D.Animal_method();
		D.DOG_Method();
		CAT C = new CAT();
		C.CAT_Method();	
		
	}

}