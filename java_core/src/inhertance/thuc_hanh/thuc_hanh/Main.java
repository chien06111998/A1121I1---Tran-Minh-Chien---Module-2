package inhertance.thuc_hanh.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("blue");
        circle.setFilled(false);
        circle.setRadius(3.5);
        System.out.println(circle);
        System.out.println("--------------------");
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Yellow");
        rectangle.setFilled(false);
        rectangle.setWidth(2.5);
        rectangle.setLength(5.0);
        System.out.println(rectangle);
        System.out.println("--------------------");
        Square square = new Square();
        square.setSide(3.5);
        square.setColor("white");
        System.out.println(square);
    }
}
