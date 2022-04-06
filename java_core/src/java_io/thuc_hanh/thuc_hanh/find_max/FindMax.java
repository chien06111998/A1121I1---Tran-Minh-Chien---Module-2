package java_io.thuc_hanh.thuc_hanh.find_max;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindMax {
    public void writeFile(String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("3\n");
            fileWriter.write("5\n");
            fileWriter.write("4\n");
            fileWriter.write("3\n");
            fileWriter.write("20\n");
            fileWriter.write("1\n");
            fileWriter.write("3\n");
            fileWriter.write("6\n");
            fileWriter.write("10\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Integer> readFile(String path) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));){
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void fileWriteMax(String path, int max) {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write("Max is = " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int findMaxValue(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }
}
