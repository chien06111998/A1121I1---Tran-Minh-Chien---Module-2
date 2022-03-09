package abstractclass_interface.thuc_hanh.thuc_hanh.interface_comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle(2.3, "Red");
        circles[2] = new Circle(2.5, "Green");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        ComparatorCircle comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles, comparatorCircle);
        System.out.println("After - sort: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
