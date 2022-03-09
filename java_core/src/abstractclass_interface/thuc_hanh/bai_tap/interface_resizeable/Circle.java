package abstractclass_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius +
                ", color= " + super.getColor() + ", area = " + getArea() ;
    }

    @Override
    public void reSize(double parcent) {
        System.out.println("Circle: ");
        System.out.println("Persent circle: " + (this.radius *= (parcent / 200)));
    }
}
