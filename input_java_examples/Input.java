
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a Message:");

        String my_message = scanner.nextLine();

        System.out.print('\n');
        System.out.println(my_message);
        
        scanner.close();
    }

}