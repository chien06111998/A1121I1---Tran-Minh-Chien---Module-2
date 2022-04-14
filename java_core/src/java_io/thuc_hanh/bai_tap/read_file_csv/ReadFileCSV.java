package java_io.thuc_hanh.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    final String SEPARATION = ", ";

    public void writeFileCaountry (String path, List<Caountry> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("ID" + SEPARATION + "Code" + SEPARATION + "Name");
            for (Caountry caountry : list) {
                writer.newLine();
                writer.write(caountry.id + SEPARATION + caountry.code + SEPARATION + caountry.name);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Caountry> readFileCaountry(String path) {
        List<Caountry> caountries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = "";
           // line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String [] value = line.split(SEPARATION);
                String id = value[0];
                String code = value[1];
                String name = value[2];
                caountries.add(new Caountry(id, code, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return caountries;
    }
}
