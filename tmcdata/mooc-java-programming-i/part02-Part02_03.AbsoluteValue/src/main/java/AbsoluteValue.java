
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        //int second = Integer.valueOf(scanner.nextLine());

        int abs = number;

        if (number < 0) {
            abs = number * -1;
        }


        System.out.println(abs);

    }
}
