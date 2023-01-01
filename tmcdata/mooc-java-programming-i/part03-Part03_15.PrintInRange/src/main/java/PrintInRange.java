
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
    }

    ArrayList<Integer> numbers = new ArrayList<>();
        
    public static void printNumbersInRange(ArrayList<Integer> numbers, int min, int max) {
        System.out.println("The numbers in the range [" + min + ", " + max + "]");
        for (int number: numbers) {
            if (number >= min && number <= max) {
                System.out.println(number);
            }
        }
    }
}
