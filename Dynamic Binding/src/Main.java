import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter First Number:");
        Double a = s.nextDouble();

        System.out.println("Enter Operation:");
        char op = s.next().charAt(0);

        System.out.println("Enter Second Number");
        Double b = s.nextDouble();

        Double result = 0.0;

        switch(op){
            case '+':
            result = a+b;
                break;

            case '-':
                result = a-b;
                break;

            case '/':
                if(b != 0){
                result = a/b;
                break;
                }

            case '*':
                result = a * b;
                break;
        }


        System.out.println("Result " + result);
    }
}