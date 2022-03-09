package abstractclass_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(double side) {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Sqare: " +
                "side = " + getSide() +
                ", color: " + super.getColor() + ", area = " + getArea(side);
    }

    @Override
    public void reSize(double parcent) {
        System.out.println("Square: ");
        System.out.println("Persent side = " + (this.side *= (parcent / 200)));
    }
}
