package inhertance.thuc_hanh.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle{
    private double hight = 1.0;

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getVolume(double hight) {
        return hight * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                "hight = " + hight + ", volume = " + getVolume(hight);
    }
}
