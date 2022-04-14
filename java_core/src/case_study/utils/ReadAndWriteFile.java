package case_study.utils;

import io_binaryfile_serilazation.thuc_hanh.bai_tap.Management;
import java_io.thuc_hanh.bai_tap.read_file_csv.Caountry;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadAndWriteFile {
    final  String SEPARATION = ", ";

    public void writeFileObject(Collection collections, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Object o : collections) {
                writer.newLine();
                writer.write(String.valueOf(o));
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
//            stream.writeObject(collections);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File file = new File(path);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(collections);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fileOutputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("Write file success.");
    }

    public Object readFileObject(String path) {
        List<Collection> collections = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = "";
            // line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return collections;

//        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))){
//            return stream.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;

//        FileInputStream fileInputStream = null;
//        ObjectInputStream objectInputStream = null;
//        Object object = null;
//        try {
//            fileInputStream = new FileInputStream(path);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            object = objectInputStream.readObject();
//            return object;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
    }
}
