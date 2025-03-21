package Java;

class Parent{ //parent class,super,derived 
	public void parent_method() {
		System.out.println("IAM IN PARENT METHOD");
		
	}
}
class Child extends Parent{ //child class or sub class 
	public void child_method() {
		System.out.println("IAM IN CHILD METHOD");
	}
}



public class Inheritance {//main class

	public static void main(String[] args) {
		Child c=new Child();
		c.child_method();
		c.parent_method();
		

	}

}
