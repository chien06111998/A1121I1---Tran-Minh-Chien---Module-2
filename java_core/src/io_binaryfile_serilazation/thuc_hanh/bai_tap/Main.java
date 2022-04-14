package io_binaryfile_serilazation.thuc_hanh.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        List<Management> managementList = new ArrayList<>();
        managementList.add(new Management("MH001", "T-Shirt", "Adidas", "150.000", "Bo comment"));
        managementList.add(new Management("MH002", "pan", "DongTien", "50.000", "Bo comment"));
        managementList.add(new Management("MH003", "dress", "Adidas", "450.000", "Bo comment"));
        managementList.add(new Management("MH004", "T-Shirt", "Adidas", "350.000", "Bo comment"));
        managementList.add(new Management("MH005", "dress", "Gucchi", "1150.000", "Bo comment"));
        managementList.add(new Management("MH006", "another hair", "hair", "350.000", "Bo comment"));
        managementList.add(new Management("MH007", "Exam", "Exam", "150.000", "Bo comment"));
        productManagement.writeFileObject("data.ini", managementList);
        System.out.println("Write file success.");
        managementList = productManagement.readFileObject("data.ini");
        managementList.forEach(System.out::println);
    }
}
