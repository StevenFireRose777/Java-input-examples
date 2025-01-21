
import java.util.Scanner;

public class num_input{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me an integar: ");
        int user_int_input = scanner.nextInt();

        System.out.println("Please give me a Double: ");
        double user_double_input = scanner.nextDouble();

        System.out.println("Please give me a float");
        float user_float_input= scanner.nextFloat();

        System.out.println("The integar you put in was: " + user_int_input);
        System.out.println("The double you put in was: " + user_double_input);
        System.out.println("The float you gave me was: " + user_float_input);



        scanner.close();
        

       

    }
}