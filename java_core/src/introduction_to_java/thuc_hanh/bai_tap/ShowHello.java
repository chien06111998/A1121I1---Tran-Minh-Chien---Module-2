package introduction_to_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
