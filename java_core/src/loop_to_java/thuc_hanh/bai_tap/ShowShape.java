package loop_to_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ShowShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Menu------------");
        System.out.println("1. Draw the rectangle.");
        System.out.println("2. Draw the square triangle.");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("0. Exit.");
        System.out.println("--------------------------");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle.");
                    System.out.print("Enter height: ");
                    int height = sc.nextInt();
                    System.out.print("Enter width: ");
                    int width = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triagle.");
                    System.out.print("Enter length: ");
                    int length = sc.nextInt();
                    for (int i = 1; i <= length; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle.");
                    System.out.print("Enter length: ");
                    int length1 = sc.nextInt();
                    for (int i = length1; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
        }
    }
}
