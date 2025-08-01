package Act1;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num1 = scan.nextInt();
            checkNumber(num1);
            
            System.out.print("\nEnter a number: ");
            int num2 = scan.nextInt();
            checkNumber(num2);
            
            System.out.print("\nEnter a number: ");
            int num3 = scan.nextInt();
            checkNumber(num3);
        }
    }

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("\nInputted number Zero");
        } else if (number % 2 == 0) {
            System.out.println("\nInputted number is even");
        } else {
            System.out.println("\nInputted number is odd");
        }
    }
}