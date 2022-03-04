package accessmodifier_staticmethod_staticproperty.thuc_hanh.bai_tap.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println("Circle: radius = " + circle.getRadius() + ", color: " + ", area = " + circle.getArea());
        //circle.toString();
    }
}
