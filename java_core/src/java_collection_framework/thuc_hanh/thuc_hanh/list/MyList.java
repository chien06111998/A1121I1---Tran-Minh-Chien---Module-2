package java_collection_framework.thuc_hanh.thuc_hanh.list;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int i) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size: " + i);
        }
        return (E) element[i];
    }
}
