package class_and_object.thuc_hanh.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a = ");
        a = sc.nextDouble();
        System.out.print("Enter b = ");
        b = sc.nextDouble();
        System.out.print("Enter c = ");
        c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.getQuadraticEquation();
    }
}
