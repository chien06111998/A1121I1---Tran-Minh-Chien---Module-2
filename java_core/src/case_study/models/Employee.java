package case_study.models;

public class Employee extends Person{
    private String degree;
    private String location;
    private long salary;

    public Employee() {
    }

    public Employee(String ID, String name, String birthday, String gender, long IDCard, long phoneNumber, String email, String degree, String location, long salary) {
        super(ID, name, birthday, gender, IDCard, phoneNumber, email);
        this.degree = degree;
        this.location = location;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() +
                "\nDegree : " + degree + '\'' +
                "\nLocation : " + location + '\'' +
                "\nsalary : " + salary;
    }
}
