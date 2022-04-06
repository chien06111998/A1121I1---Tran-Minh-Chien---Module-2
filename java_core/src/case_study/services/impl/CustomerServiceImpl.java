package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();
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
        customerList.add(customer);
    }

    @Override
    public void displayNewCustemer() {
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
