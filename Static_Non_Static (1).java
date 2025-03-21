package Java;

public class Static_Non_Static {

    public static class Example {

        public static void staticMethod() {
            System.out.println("This is a static method.");
        }

        public void nonStaticMethod() {
            System.out.println("This is a non-static method.");
        }
    }

public static void main(String[]args) {
	Example.staticMethod();
	Example example = new Example();
	 example.nonStaticMethod();
  }
	
}