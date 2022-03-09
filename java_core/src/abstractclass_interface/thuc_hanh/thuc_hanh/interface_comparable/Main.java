package abstractclass_interface.thuc_hanh.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.5);
        circles[1] = new ComparableCircle(2.6, "Yellow");
        circles[2] = new ComparableCircle(2.0, "Green");
        System.out.println("Pre - sorted: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After - sorted: ");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }
    }
}
