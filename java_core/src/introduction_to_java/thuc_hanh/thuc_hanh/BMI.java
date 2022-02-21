package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Calculate weight index");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight (Kilogram): ");
        Double weight;
        weight = sc.nextDouble();
        System.out.println("Enter height (meter): ");
        Double height;
        height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25){
            System.out.println("Nomal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
