package java_collection_framework.thuc_hanh.bai_tap.array_list;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        minCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public void insert(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(DEFAULT_CAPACITY);
        }
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        get(index);
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        size += 1;
        ensureCapacity(DEFAULT_CAPACITY);
        elements[size - 1] = e;
        return true;
    }

    public E clone() {
        MyArrayList<E> clone = new MyArrayList<>(size);
        for (Object e : elements) {
            clone.add((E) e);
        }
        return (E) clone;
    }

    public boolean contains(E e) {
        for (Object o : elements) {
            if (e.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (Object o : elements) {
            if (o.equals(e)) {
                return 1;
            }
        }
        return 0;
    }

    public E get(int i) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("index i = " + i + ", size: " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        this.elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void show() {
        for (Object o : elements) {
            System.out.print(o + " ");
        }
    }

}
