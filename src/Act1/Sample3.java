package Act1;

import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num1 = scan.nextInt();
            checkSign(num1);
            
            System.out.print("\nEnter a number: ");
            int num2 = scan.nextInt();
            checkSign(num2);
            
            System.out.print("\nEnter a number: ");
            int num3 = scan.nextInt();
            checkSign(num3);
        }
    }

    public static void checkSign(int number) {
        if (number > 0) {
            System.out.println("\n" + number + " is a positive number");
        } else if (number < 0) {
            System.out.println("\n" + number + " is a negative number");
        } else {
            System.out.println("\nInputted number Zero");
        }
    }
}