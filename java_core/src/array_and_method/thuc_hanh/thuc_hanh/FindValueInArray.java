package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = Integer.parseInt(sc.nextLine());
        String [] arr = new String[size];
        System.out.println("Enter name student: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Secondary student " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        System.out.print("Array = ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter a name student ");
        String name = sc.nextLine();
        boolean checkStudent = false;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is : " + (i + 1) );
                checkStudent = true;
                break;
            }
        }
        if (!checkStudent) {
            System.out.println("Not pound " + name + " in the list.");
        }
    }
}
