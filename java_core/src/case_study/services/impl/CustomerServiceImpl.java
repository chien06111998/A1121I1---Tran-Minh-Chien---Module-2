package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();

    static final String SEPARATION = ", ";

    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void addNewCustomer() {
        String ID, name, birthday, gender, email, customerType, address;
        long IDCard, phoneNumber;
        System.out.println("<<-------------Enter a list of customer------------->>");
        System.out.print("Enter ID customer: ");
        ID = sc.nextLine();
        System.out.print("Enter name customer: ");
        name = sc.nextLine();
        System.out.print("Enter birthday customer: ");
        birthday = sc.nextLine();
        System.out.print("Enter gender customer: ");
        gender = sc.nextLine();
        System.out.print("Enter ID Card customer: ");
        IDCard = Long.parseLong(sc.nextLine());
        System.out.print("Enter phone number customer: ");
        phoneNumber = Long.parseLong(sc.nextLine());
        System.out.print("Enter email customer: ");
        email = sc.nextLine();
        System.out.print("Enter customer type customer: ");
        customerType = sc.nextLine();
        System.out.print("Enter address customer: ");
        address = sc.nextLine();
        Customer customer = new Customer(ID, name, birthday, gender, IDCard, phoneNumber, email, customerType, address);
        //customerList.add(customer);
        readAndWriteFile.writeFileObject(Collections.singletonList(customer.getID() + SEPARATION + customer.getName() + SEPARATION + customer.getBirthday() + SEPARATION + customer.getGender() + SEPARATION +
                customer.getIDCard() + SEPARATION + customer.getPhoneNumber() + SEPARATION + customer.getEmail() + SEPARATION + customer.getCustomerType() + SEPARATION + customer.getAddress()), "D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\customer.csv");
    }

    @Override
    public void displayNewCustemer() {
        readAndWriteFile.readFileObject("D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\customer.csv");
        for (Customer customer : customerList) {
            System.out.print(customer.toString() + "\n");
        }
    }

    @Override
    public void editCustomer() {
        System.out.print("Enter the employee ID to edit: ");
        String ID_edit = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getID().equals(ID_edit)) {
                System.out.print("Enter customer ID edit: ");
                customerList.get(i).setID(sc.nextLine());
                System.out.print("Enter customer name edit: ");
                customerList.get(i).setName(sc.nextLine());
                System.out.print("Enter customer birthday edit: ");
                customerList.get(i).setBirthday(sc.nextLine());
                System.out.print("Enter customer gender edit: ");
                customerList.get(i).setGender(sc.nextLine());
                System.out.print("Enter customer ID Card edit: ");
                customerList.get(i).setIDCard(Long.parseLong(sc.nextLine()));
                System.out.print("Enter customer phone number edit: ");
                customerList.get(i).setPhoneNumber(Long.parseLong(sc.nextLine()));
                System.out.print("Enter customer customer type edit: ");
                customerList.get(i).setCustomerType(sc.nextLine());
                System.out.print("Enter customer address edit: ");
                customerList.get(i).setAddress(sc.nextLine());
            } else {
                System.out.println("ID = " + ID_edit + " not existed.");
            }
        }
    }
}
