package io_binaryfile_serilazation.thuc_hanh.bai_tap;

import java.io.*;
import java.util.List;

public class ProductManagement {
    //final String SEPARATION = ", ";
    public void writeFileObject(String path, List<Management> managementList) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
            stream.writeObject(managementList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Management> readFileObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))){
            return (List<Management>) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
