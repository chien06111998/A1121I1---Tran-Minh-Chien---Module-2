package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadAndWriteFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static final String SEPARATION = ", ";
    Scanner sc = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    @Override
    public void addNewEmployee() {
        String ID, name, birthday, gender, email, degree, location;
        long IDCard, phoneNumber, salary;
        System.out.println("<<-------------Enter a list of employees------------->>");
        System.out.print("Enter ID employee: ");
        ID = sc.nextLine();
        System.out.print("Enter name employee: ");
        name = sc.nextLine();
        System.out.print("Enter birthday employee: ");
        birthday = sc.nextLine();
        System.out.print("Enter gender employee: ");
        gender = sc.nextLine();
        System.out.print("Enter ID Card employee: ");
        IDCard = Long.parseLong(sc.nextLine());
        System.out.print("Enter phone number employee: ");
        phoneNumber = Long.parseLong(sc.nextLine());
        System.out.print("Enter email employee: ");
        email = sc.nextLine();
        System.out.print("Enter degree employee: ");
        degree = sc.nextLine();
        System.out.print("Enter location employee: ");
        location = sc.nextLine();
        System.out.print("Enter salary employee: ");
        salary = Long.parseLong(sc.nextLine());
        Employee employee = new Employee(ID, name, birthday, gender, IDCard, phoneNumber, email, degree, location, salary);
        employeeList.add(employee);
        readAndWriteFile.writeFileObject(Collections.singleton((employee.getID() + SEPARATION + employee.getName() + SEPARATION + employee.getBirthday() + SEPARATION + employee.getGender() + SEPARATION +
                employee.getIDCard() + SEPARATION + employee.getPhoneNumber() + SEPARATION + employee.getEmail() + SEPARATION + employee.getDegree() + SEPARATION + employee.getLocation() + SEPARATION +
                employee.getSalary())), "D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\employee.csv");
        //readAndWriteFile.writeFileObject(employeeList, "D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\employee.csv");
    }

    @Override
    public void displayEmployee() {
        employeeList = (List<Employee>) readAndWriteFile.readFileObject("D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.print(employee.toString() + "\n");
        }
    }

    @Override
    public void editEmployee() {
        System.out.print("Enter the employee ID to edit: ");
        String ID_edit = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getID().equals(ID_edit)) {
                System.out.print("Enter employee ID edit: ");
                employeeList.get(i).setID(sc.nextLine());
                System.out.print("Enter employee name edit: ");
                employeeList.get(i).setName(sc.nextLine());
                System.out.print("Enter employee birthday edit: ");
                employeeList.get(i).setBirthday(sc.nextLine());
                System.out.print("Enter employee gender edit: ");
                employeeList.get(i).setGender(sc.nextLine());
                System.out.print("Enter employee ID Card edit: ");
                employeeList.get(i).setIDCard(Long.parseLong(sc.nextLine()));
                System.out.print("Enter employee phone number edit: ");
                employeeList.get(i).setPhoneNumber(Long.parseLong(sc.nextLine()));
                System.out.print("Enter employee degree edit: ");
                employeeList.get(i).setDegree(sc.nextLine());
                System.out.print("Enter employee location edit: ");
                employeeList.get(i).setLocation(sc.nextLine());
                System.out.print("Enter employee salary edit: ");
                employeeList.get(i).setSalary(Long.parseLong(sc.nextLine()));
                break;
            } else {
                System.out.println("ID = " + ID_edit + " not existed.");
            }
        }
    }
}
