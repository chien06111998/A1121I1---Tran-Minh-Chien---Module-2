package io_binaryfile_serilazation.thuc_hanh.thuc_hanh.read_write_student;

import accessmodifier_staticmethod_staticproperty.thuc_hanh.thuc_hanh.static_method.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Students> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(students);
            obs.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Students> readDataFromFile(String path){
        List<Students> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream obi = new ObjectInputStream(fis);
            students = (List<Students>) obi.readObject();
            fis.close();
            obi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Students(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Students(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Students(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Students(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("student.txt", students);
        List<Students> studentDataFromFile = readDataFromFile("student.txt");
        for (Students student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
