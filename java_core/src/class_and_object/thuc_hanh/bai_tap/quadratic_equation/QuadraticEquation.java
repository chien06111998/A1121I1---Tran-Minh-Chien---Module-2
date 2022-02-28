package class_and_object.thuc_hanh.bai_tap.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void getQuadraticEquation() {
        if (this.a == 0) {
            System.out.print("The tested equation is: " + -this.c/this.b);
        } else {
            double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
            if (delta == 0) {
                System.out.print("The double-tested equation is: " +-this.b / (2 * this.a));
            } else if (delta > 0) {
                System.out.println("The equation has two experiments: ");
                System.out.print("\nx1 = " + (-this.b - Math.sqrt(delta)) / (2 * this.a));
                System.out.print(" end x2 = " + (-this.b + Math.sqrt(delta)) / (2 * this.a));
            } else {
                System.out.println("The equation has no roots.");
            }
        }
    }
}
