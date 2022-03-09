package abstractclass_interface.thuc_hanh.bai_tap.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4.5,"yellow");
        System.out.println(square);
        square.howToColor();
    }
}
