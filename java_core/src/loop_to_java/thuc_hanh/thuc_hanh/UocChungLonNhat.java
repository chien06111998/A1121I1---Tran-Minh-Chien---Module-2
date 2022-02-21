package loop_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a= ");
        a = sc.nextInt();
        System.out.print("Enter b= ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("\nNo greatest common factor.");
        }
        System.out.println("a = " + a + ", b = " + b);
        while (a != b) {
            if (a > b) {
                a -= b;
                System.out.print("\nGreatest common factor: " + a);
            } else {
                b -= a;
                System.out.print("\nGreatest common factor: " + b);
            }
        }
    }
}
