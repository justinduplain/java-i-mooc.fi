
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int input;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.print("Search for? ");
        int searchFor = Integer.valueOf(scanner.nextLine());
        System.out.println("");

        list.remove(searchFor);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchFor) {
                System.out.println(searchFor + " is at index " + i);
            }
        }
        
        System.out.println("");
    }
}
