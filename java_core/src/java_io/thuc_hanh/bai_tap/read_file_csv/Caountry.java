package java_io.thuc_hanh.bai_tap.read_file_csv;

public class Caountry {
    public String id;
    public String code;
    public String name;

    public Caountry() {
    }

    public Caountry(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Caountry: " +
                "id = " + id +
                ", code = " + code +
                ", name = " + name;
    }
}
