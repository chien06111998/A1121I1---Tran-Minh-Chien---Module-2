package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Menu-----------");
        System.out.println("1. Fahrenheit to Celsius.");
        System.out.println("2. Celsius to Fahrenheit.");
        System.out.println("0. Exit.");
        System.out.println("--------------------------");
        System.out.print("Enter temperature = ");
        double temperature = sc.nextDouble();
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.print("\nFahrenheit to Celsius:\n (Fahrenheit) " + temperature +  " = " + celsius(temperature) + " (Selsius)");
                    break;
                case 2:
                    System.out.print("\nCelsius to Fahrenheit is:\n (Selsius) " + temperature + " = " + fahrenheit(temperature) + " (Fahrenheit");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Choice is not found.");

            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    public static double celsius(double fahrenheit) {
        return (double) ((5.0 / 9) * (fahrenheit - 32));
    }
    public static double fahrenheit(double celsius) {
        return 32 + celsius / (5.0 / 9);
    }
}
