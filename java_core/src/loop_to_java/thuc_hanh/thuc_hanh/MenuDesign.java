package loop_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class MenuDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Menu------------");
        System.out.println("1. Draw the triangle.");
        System.out.println("2. Draw the square.");
        System.out.println("3. Draw the rectangle.");
        System.out.println("0. Exit.");
        System.out.println("--------------------------");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.print("Enter length: ");
                    int length = sc.nextInt();
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.print("Enter length: ");
                    int length1 = sc.nextInt();
                    for (int i = 1; i <= length1; i++) {
                        for (int j = 1; j <= length1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    int height, widthl;
                    System.out.println("Enter height: ");
                    height = sc.nextInt();
                    System.out.println("Enter width: ");
                    widthl = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= widthl; j++) {
                            System.out.println("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
}
