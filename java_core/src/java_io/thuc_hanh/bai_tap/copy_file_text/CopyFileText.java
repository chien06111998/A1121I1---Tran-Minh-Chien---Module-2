package java_io.thuc_hanh.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public void fileWrite(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            BufferedReader bf = new BufferedReader(new FileReader("D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\java_io\\thuc_hanh\\bai_tap\\copy_file_text\\sourcefile.txt"));
            String line = "";
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                writer.write(Integer.parseInt(line));
            }
            System.out.println("Write file success.");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
