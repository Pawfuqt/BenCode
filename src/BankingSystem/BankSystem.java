package BankingSystem;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingClass banking = new BankingClass();
        boolean running = true;

        System.out.println("HELLO WELCOME TO BENIQT BANKING SYSTEM");

        while (running) {
            System.out.println("\nWhat can I do for you today?");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Doctor's Appointment");
            System.out.println("4. Shopping");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    int attempts = 0;
                    boolean success = false;

                    while (attempts < 3 && !success) {
                        System.out.print("\nEnter your Account No: ");
                        int accNo = sc.nextInt();

                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();

                        if (banking.verifyAccount(accNo, pin)) {
                            System.out.println("\nLOGIN SUCCESSFULLY! You are now logged in.");
                            success = true;

                            // Ask if user wants to continue
                            System.out.print("Do you want to continue using the system? (Y/N): ");
                            char cont = sc.next().toUpperCase().charAt(0);
                            if (cont != 'Y') {
                                running = false;
                            }
                        } else {
                            attempts++;
                            System.out.println("INVALID ACCOUNT or PIN! Attempt " + attempts + " of 3");
                        }
                    }

                    if (!success) {
                        System.out.println("\nAccount locked. Too many failed attempts.");
                    }
                    break;

                case 2: 
                    System.out.print("\nEnter a new Account No: ");
                    int newAccNo = sc.nextInt();

                    System.out.print("Enter a new Pin: ");
                    int newPin = sc.nextInt();

                    if (banking.registerAccount(newAccNo, newPin)) {
                        System.out.println("Registration successful! You can now log in.");
                    } else {
                        System.out.println("Registration failed! Account number may already exist or storage is full.");
                    }
                    break;

                case 3:
                    System.out.println("Doctor's Appointment feature coming soon.");
                    break;

                case 4:
                    System.out.println("Shopping feature coming soon.");
                    break;

                case 5:
                    System.out.println("Thank you for using BENIQT Banking System. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Selection!");
            }
        }

        sc.close();
    }
}
