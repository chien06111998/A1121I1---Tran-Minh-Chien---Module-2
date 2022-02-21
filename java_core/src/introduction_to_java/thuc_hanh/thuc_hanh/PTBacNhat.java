package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai PT bac nhat ax + b = 0");
        int a;
        int b;
        System.out.println("Enter a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc. nextInt();
        if (a == 0) {
            System.out.println("PT vô nghiệm.");
        } else {
            System.out.println("PT có nghiệm là: " + (-b / a));
        }
    }
}
