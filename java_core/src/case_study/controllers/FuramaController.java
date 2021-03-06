package case_study.controllers;

import case_study.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("------------------Menu------------------");
        System.out.println("1. Employee Management.");
        System.out.println("2. Customer Management.");
        System.out.println("3. Facility Management.");
        System.out.println("4. Booking Managerment.");
        System.out.println("5. Promotion Management.");
        System.out.println("6. Exit.");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = 0;
        while (choice != 6) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagerment();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }

    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        System.out.println("---------Menu Employee Management---------");
        System.out.println("1. Display list employees.");
        System.out.println("2. Add new employee.");
        System.out.println("3. Edit employee.");
        System.out.println("4. Return main menu.");
        System.out.println("-----------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = 0;
        while (choice != 6) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    System.out.println("<<-------------The list of employees------------->>");
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    mainMenu();
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }

    public static void customerManagement () {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        System.out.println("---------Menu Customer Management--------");
        System.out.println("1. Display list customers.");
        System.out.println("2. Add new customer.");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu.");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice: ");
        int choice = 0;
        while (choice != 6) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    customerService.displayNewCustemer();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    mainMenu();
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }

    public static void facilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("---------Menu Facility Management--------");
        System.out.println("1. Display list customers.");
        System.out.println("2. Add new customer.");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu.");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice: ");
        int choice = 0;
        while (choice != 6) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    addFacilityService();
                    break;
                case 3:
                    facilityService.maintenanceFacility();
                    break;
                case 4:
                    mainMenu();
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }

    public static void bookingManagerment () {
        BookingSerciveImpl bookingSercive = new BookingSerciveImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        System.out.println("---------Menu Booking Management--------");
        System.out.println("1. Add new booking.");
        System.out.println("2. Display list booking.");
        System.out.println("3. Create new constracts.");
        System.out.println("4. Display list contracts.");
        System.out.println("5. Edit contracts.");
        System.out.println("6. Return main menu.");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice: ");
        int choice = 0;
        while (choice != 6) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    bookingSercive.addBooking();
                    break;
                case 2:
                    bookingSercive.displayListBooking();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    mainMenu();
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }

    public static void promotionManagement() {
        System.out.println("---------Menu Customer Management--------");
        System.out.println("1. Display list customers use service.");
        System.out.println("2. Display list customers get voucher.");
        System.out.println("3. Return main menu.");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice: ");
        int choice = 0;
        while (choice != 6) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    System.out.println("1. Display list customers use service.");
                    break;
                case 2:
                    System.out.println("2. Display list customers get voucher.");
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }

    public static void addFacilityService () {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("---------Add new Facility Service--------");
        System.out.println("1. Add new Villa.");
        System.out.println("2. Add new House.");
        System.out.println("3. Add new Room.");
        System.out.println("4. Back to menu.");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice: ");
        int choice = 0;
        while (choice != 4) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong function, please re-enter it.");
            }
            switch (choice) {
                case 1:
                    System.out.println("Add new Villa:");
                    facilityService.addNewVilla();
                    break;
                case 2:
                    System.out.println("Add new House:");
                    facilityService.addNewHouse();
                    break;
                case 3:
                    System.out.println("Add new Room:");
                    facilityService.addNewRoom();
                    break;
                case 4:
                    facilityManagement();
                    break;
                default:
                    System.out.println("No choice.");
            }
            System.out.print("Choice next function: ");
            choice = sc.nextInt();
        }
    }
}
