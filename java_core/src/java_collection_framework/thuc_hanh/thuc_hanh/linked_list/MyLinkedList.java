package java_collection_framework.thuc_hanh.thuc_hanh.linked_list;

import java.util.Date;

public class MyLinkedList {
    private Node head;
    private int numNOdes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNOdes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        Node newData = new Node(data);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newData;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNOdes++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
