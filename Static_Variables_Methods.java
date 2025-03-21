package Java;


public class Static_Variables_Methods {
	
	
	//variables
	static int a=100;//static variable
	int b=200;//non-static method
	
	
	//methods
	public static void static_method() {
		System.out.println("This is static method");
	}
	
	public  void nonstatic_method() {
		System.out.println("This is Non or Instance static method");
	}
	

	public static void main(String[] args) {
		System.out.println("a value:"+a);
		Static_Variables_Methods obj=new Static_Variables_Methods();
		System.out.println("b value:"+obj.b);
		static_method();
		obj.nonstatic_method();
		
		

	}

}
