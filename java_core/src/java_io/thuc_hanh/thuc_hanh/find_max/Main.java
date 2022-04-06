package java_io.thuc_hanh.thuc_hanh.find_max;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindMax findMax = new FindMax();
        findMax.writeFile("FindMax.csv");
        System.out.println("Write file cuccess");
        List<Integer> list = findMax.readFile("FindMax.csv");
        findMax.fileWriteMax("FindMax.csv", findMax.findMaxValue(list));
    }
}
