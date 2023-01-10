

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int value = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value) {
                System.out.println(value + " is at index " + i + ".");
            } else {
                System.out.println(value + " was not found.");
            }
        }
    }

}
