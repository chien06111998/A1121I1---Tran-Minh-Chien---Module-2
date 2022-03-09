package abstractclass_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle("Red", 4.5, 3.0);
        shapes[2] = new Square(3.5);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape1 : shapes) {
            shape1.reSize(Math.random() * 1000);
        }
    }
}
