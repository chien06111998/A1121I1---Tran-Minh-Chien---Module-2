package java_io.thuc_hanh.thuc_hanh.sum;

import java.io.*;

public class FileUtils {
    final String SEPARETION= ",";
    public void writeFile(String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("1\n");
            fileWriter.write("12\n");
            fileWriter.write("3\n");
            fileWriter.write("4\n");
            fileWriter.write("-2\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = "";
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("Sum = " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
