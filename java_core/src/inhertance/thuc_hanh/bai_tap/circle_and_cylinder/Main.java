package inhertance.thuc_hanh.bai_tap.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "Yellow");
        Cylinder cylinder = new Cylinder(2.5);
        circle = new Circle(4.0, "Blue");
        System.out.println(circle);
        System.out.println("-------------------");
        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);
    }
}
