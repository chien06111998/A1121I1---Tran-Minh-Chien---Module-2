package abstractclass_interface.thuc_hanh.bai_tap.interface_colorable;

public class Square implements Colorable{
    private double side;
    private String color;

    public Square() {
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square : " +
                "side=" + side +
                ", area = " + getArea();
    }


    @Override
    public void howToColor() {
        System.out.println("Paint the four sides of a square.");
    }
}
