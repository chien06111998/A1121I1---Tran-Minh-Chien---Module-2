package accessmodifier_staticmethod_staticproperty.thuc_hanh.bai_tap.xay_dung_class;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Thomas", "T01");
        System.out.println(student.getName() + " in class " + student.getClasses());
    }
}
