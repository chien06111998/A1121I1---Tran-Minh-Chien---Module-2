package java_collection_framework.thuc_hanh.thuc_hanh.linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
//        myLinkedList.addFirst(2);
//        myLinkedList.addFirst(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(7);
        myLinkedList.addLast(12);
        myLinkedList.print();
    }
}
