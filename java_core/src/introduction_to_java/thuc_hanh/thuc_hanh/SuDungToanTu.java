package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        double height;
        double width;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        area = height * width;
        System.out.print("Show area = " + area);
    }
}
