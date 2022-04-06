package java_io.thuc_hanh.thuc_hanh.sum;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUntils = new FileUtils();
        fileUntils.writeFile("TestSum.txt");
        System.out.println("Write file success.");
        fileUntils.readFromFile("TestSum.txt");
    }
}
