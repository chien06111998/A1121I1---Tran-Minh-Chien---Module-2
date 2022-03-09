package abstractclass_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(double length, double width) {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "length = " + length +
                ", width = " + width + ", color: " + super.getColor() + ", area = " + getArea(length, width);
    }

    @Override
    public void reSize(double parcent) {
        System.out.println("Rectangle: ");
        System.out.println("Persent lenght: " + (this.length *= (parcent / 200)));
        System.out.println("Persent width: " + (this.width *= (parcent / 200)));
    }
}
