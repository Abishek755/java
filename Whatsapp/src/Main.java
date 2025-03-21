import java.util.Scanner;

class apps{
    String user_name;
    String password;

    void user_input(){

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Username:");
            user_name = s.nextLine();
            System.out.println("Enter Password");
            password = s.nextLine();

            if( user_name.equals("swarna")  && password.equals("as@1417")){
                System.out.println("Login Success");
                break;
            }

        }
    }
}
public class Main {
    public static void main(String[] args) {
            apps whatsapp = new apps();
            whatsapp.user_input();
        }
    }
