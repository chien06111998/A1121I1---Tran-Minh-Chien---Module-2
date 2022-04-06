package exception_debug.thuc_hanh.bai_tap.illegal_triangle_exception;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Triagle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three sides of triagle:");
        int a, b, c;
        System.out.print("Enter a = ");
        a = sc.nextInt();
        System.out.print("Enter b = ");
        b = sc.nextInt();
        System.out.print("Enter c = ");
        c = sc.nextInt();
        try {
            triagle(a, b, c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

    public static void triagle(int a, int b, int c) throws IllegalTriangleException{
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("a = " + a + ", b = " + b + ", c = " + c + " are the three sides is not the triangle.");
        } else {
            if (a + b <=c || b + c <= a || a + c <=b) {
                throw new IllegalTriangleException("a = " + a + ", b = " + b + ", c = " + c + " are the three sides is not the triangle.");
            } else {
                throw new IllegalTriangleException("a = " + a + ", b = " + b + ", c = " + c + " are the three sides of the triangle.");
            }
        }
    }
}
