package loop_to_java.thuc_hanh.bai_tap;

public class ShowPrimeLessThan100 {
    public static void main(String[] args) {
        System.out.print("100 prime less than 100 is: ");
        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkPrime(int n) {
        int squareRoot = (int) Math.sqrt(n);
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
