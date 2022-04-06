package exception_debug.thuc_hanh.thuc_hanh.array_index_out_bound_exception;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5 " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi han cua mang.");
        }
    }
}
