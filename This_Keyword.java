package Java;

class Flower{
	private String flower_name;//attribute or properties
	private String flower_color;
	private int flower_price;
	
	Flower(String flower_name,String flower_color, int flower_price){//Constructor
		
		this.flower_name=flower_name;//this keyword
		this.flower_color=flower_color;
		this.flower_price=flower_price;
		
		System.out.println("Flower name is:"+flower_name);
		System.out.println("Flower color is:"+flower_color);
		System.out.println("Flower color is:"+flower_price);
		
	}
	
	public void flower_method() { //method userdefined method
		
		System.out.println("Flower name is using method:"+flower_name);
//		System.out.println("Flower color is:"+flower_color);
	}
	
	
	
}

public class This_Keyword {

	public static void main(String[] args) {
		Flower obj=new Flower("Rose","Red",200);
		obj.flower_method();
		

	}

}
