package Java;
import java.util.Scanner;


abstract class Software {
    String Phone_Number;
    String OTP;
    
    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Phone Number:");
        Phone_Number = s.nextLine();
        
        System.out.println("Enter OTP:");
        OTP = s.nextLine();
    }
    
    void User_Login() {
        System.out.println("Welcome to WhatsApp");
        System.out.println("------------------");
        System.out.println("<---Please Login Here--->");
    }
    
    abstract void app_open();
}

class WhatsApp_App extends Software {

    @Override
    void app_open() {
        while (true) {
            if (Phone_Number.equals("8688238202") && OTP.equals("1234")) {
                System.out.println("Successfully Login Completed, Welcome to App");
                break;
            } else {
                System.out.println("Wrong Credentials...! <---try again---->");
                user_input();
            }
        }
    }
    
    void app_Close() {
        System.out.println("App is Closed ");
    }
}

public class Apps2 {

    public static void main(String[] args) {
        WhatsApp_App W = new WhatsApp_App();
        W.User_Login();
        W.user_input();
        W.app_open();
        W.app_Close();  // You may want to call app_Close after the login is successful
    }
}
