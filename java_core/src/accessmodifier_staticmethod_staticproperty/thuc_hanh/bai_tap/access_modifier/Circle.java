package accessmodifier_staticmethod_staticproperty.thuc_hanh.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

//    @Override
//    public String toString() {
//        return "Circle: " +
//                "radius = " + radius +
//                ", color = " + color + ", area = " + getArea();
//    }
}
