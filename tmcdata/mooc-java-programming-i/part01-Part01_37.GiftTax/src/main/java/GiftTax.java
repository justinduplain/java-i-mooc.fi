
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        Integer value = Integer.valueOf(scan.nextLine());
        Integer baseTax = 0;
        Double taxRate = .0;
        Integer taxBasis = 0;

        if (value >= 1000000) {
            taxBasis = 1000000;
            baseTax = 142100;
            taxRate = .17;
        } else if (value >= 200000) {
            taxBasis = 200000;
            baseTax = 22100;
            taxRate = .15;
        } else if (value >= 55000) {
            taxBasis = 55000;
            baseTax = 4700;
            taxRate = .12;
        } else if (value >= 25000) {
            taxBasis = 25000;
            baseTax = 1700;
            taxRate = .1;
        } else if (value >= 5000) {
            taxBasis = 5000;
            baseTax = 100;
            taxRate = .08;
        }

        Double totalTax = baseTax + ((value - taxBasis) * taxRate);

        if (totalTax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + totalTax);
        }
    }
}
