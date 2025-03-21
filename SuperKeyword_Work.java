package Java.work;

class Super{
	String name ;
	Super(String name){ //constructor                    
	this.name=name;	
	System.out.println("Flower Name:"+this.name);
	}
	
}
class Child3 extends Super{

	Child3(String name) {
		super(name);
		System.out.println("Flower Color:"+this.name);
		
	}
	
}

public class SuperKeyword_Work {//main class

	public static void main(String[] args) {
		Child3 s =new Child3("Rose");
	
		
	
		

	}

}