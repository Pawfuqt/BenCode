package Act1;

import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            
            System.out.print("Enter marks in Science: ");
            int science = input.nextInt();
            
            System.out.print("Enter marks in History: ");
            int history = input.nextInt();
            
            System.out.print("Enter marks in Math: ");
            int math = input.nextInt();
            
            System.out.print("Enter marks in Soc: ");
            int soc = input.nextInt();
            
            System.out.print("Enter marks in Arts: ");
            int arts = input.nextInt();
            
            int total = science + history + math + soc + arts;
            double percent = total / 5.0;
            
            String remarks = "";
            if (percent < 70) {
                remarks = "Fail";
            } else if (percent >= 71 && percent <= 75) {
                remarks = "Poor";
            } else if (percent >= 76 && percent <= 80) {
                remarks = "Fair";
            } else if (percent >= 81 && percent <= 85) {
                remarks = "Good";
            } else if (percent >= 86 && percent <= 90) {
                remarks = "Very Good";
            } else if (percent >= 91 && percent <= 100) {
                remarks = "Excellent";
            }
            
            System.out.println("\nTotal Marks: " + total);
            System.out.printf("Total percentage: %.2f\n", percent);
            System.out.println("Remarks: " + remarks);
            
            if (percent < 70) {
                System.out.println("Try Again " + name + ".");
            } else {
                System.out.println("Congrats " + name + " you Passed.");
            }
        }
    }
}