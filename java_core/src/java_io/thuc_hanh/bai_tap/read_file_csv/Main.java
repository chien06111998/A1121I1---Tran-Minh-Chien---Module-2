package java_io.thuc_hanh.bai_tap.read_file_csv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        List<Caountry> caountryList = new ArrayList<>();
//        caountryList.add(new Caountry("1", "AU","Australia"));
//        caountryList.add(new Caountry("2","CN","China"));
//        caountryList.add(new Caountry("3","AU","Australia"));
//        caountryList.add(new Caountry("4","JP","Japan"));
//        caountryList.add(new Caountry("5", "CN","China"));
//        caountryList.add(new Caountry("6", "JP","Japan"));
//        caountryList.add(new Caountry("7", "TH","Thailand"));
       // readFileCSV.writeFileCaountry("caountry.csv", caountryList);
        caountryList = readFileCSV.readFileCaountry("caountry.csv");
        caountryList.forEach(System.out::println);
    }
}
