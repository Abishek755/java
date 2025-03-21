package Java;
import java.util.Scanner;

// Implementation of Abstraction
abstract class Softwares { // abstract class
    String User_name;
    String password;

    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Username:");
        User_name = s.nextLine();
        System.out.println("Enter Password:");
        password = s.nextLine();
    }

    void user_login() {
        System.out.println("Welcome to Instagram");
        System.out.println("---------------------");
        System.out.println("Please Login here");
    }

    abstract void app_open(); // abstract method
}

class Instagram extends Softwares { // child class
    @Override
    void app_open() {
    	while(true)
        if (User_name.equals("uditha") && password.equals("123@u")) {
            System.out.println("Successfully login, app is open:");
            break;
        } else {
            System.out.println("Invalid Username and Password");
            user_input();
        }
    }
}

public class Apps {  // The main class should be outside
    public static void main(String[] args) {
        Instagram I = new Instagram();
        I.user_login();
        I.user_input();
        I.app_open();
    }
}
