
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i <= input; i++){
            System.out.println(i);
        }

    }
}
