package inhertance.thuc_hanh.bai_tap.point_and_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.5f, 4.2f);
        System.out.println(point);
        System.out.println("--------------------------");
        MoveablePoint moveablePoint = new MoveablePoint(2.5f, 3.0f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
