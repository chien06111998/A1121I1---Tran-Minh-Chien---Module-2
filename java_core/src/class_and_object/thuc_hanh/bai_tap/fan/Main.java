package class_and_object.thuc_hanh.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.MEDIUM, true, 10, "yello");
        Fan fan2 = new Fan(Fan.SLOW, false, 5, "blue");
        System.out.print(fan1);
        System.out.print("\n"+ fan2);
    }
}
