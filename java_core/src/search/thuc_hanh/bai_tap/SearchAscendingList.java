package search.thuc_hanh.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchAscendingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your list: ");
        String list = sc.nextLine();
        searchAscendingList(list);
    }
    public static void searchAscendingList(String list) {
        LinkedList<Character> newList = new LinkedList<>();
        for (int i = 0; i < list.length(); i++) {
            newList.add(list.charAt(i));
            for (int j = i + 1; j < list.length(); j++) {
                if (list.charAt(j) > newList.getLast()) {
                    newList.add(list.charAt(j));
                }
            }
        }
        for (Character ch : newList) {
            System.out.print(ch);
        }
    }
}
