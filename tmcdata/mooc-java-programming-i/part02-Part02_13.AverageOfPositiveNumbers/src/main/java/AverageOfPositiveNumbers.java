
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                continue;
            }
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/count);
        }
    }
}