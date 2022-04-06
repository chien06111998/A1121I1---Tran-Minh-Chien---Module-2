package java_collection_framework.thuc_hanh.bai_tap.array_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Anh");
        myArrayList.add("Hung");
        myArrayList.add("Hoa");
        myArrayList.add("Trung");
        myArrayList.show();
        System.out.println("\nArray list after insert: ");
        myArrayList.insert(2, "Toan");
        myArrayList.show();
        System.out.println("\nArray list after remove: ");
        myArrayList.remove(3);
        myArrayList.show();

    }
}
