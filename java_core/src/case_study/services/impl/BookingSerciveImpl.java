package case_study.services.impl;

import case_study.models.*;
import case_study.services.BookingService;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class BookingSerciveImpl implements BookingService {
    static Scanner sc = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
//    static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
//    static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
//    static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer("1", "Chien", "22", "Male", 123456789,
                0235357573, "chien@gmail.com", "VIP", "Ha Noi"));
        customerList.add(new Customer("2", "Hoang", "22", "Male", 987654321,
                0235357575, "hoang@gmail.com", "Nomal", "Da Nang"));
        facilityIntegerMap.put(new Villa("1","Villa", 200, 15000000, 4,
                "Day", "VIP", 45, 3), 0);
        facilityIntegerMap.put(new Room("2", "Room", 25, 250000, 2,
                "Day", "No free"), 0);
        facilityIntegerMap.put(new House("3", "House", 100, 2000000, 5,
                "Week", "Nomal", 3), 0);
    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    static final String SEPARATION = ", ";

    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = cheeseCustommer();
        Facility facility = chooseFacility();
//        Villa villa = chooseVilla();
//        Room room = chooseRoom();
//        House house = chooseHouse();
        System.out.print("Enter star day: ");
        String starDay = sc.nextLine();
        System.out.print("enter end day: ");
        String endDay = sc.nextLine();
        Booking booking = new Booking(id, starDay, endDay, customer, facility);
        bookingSet.add(booking);
        //System.out.println("Booking success.");
        readAndWriteFile.writeFileObject(Collections.singleton(booking.getIDBooking() + SEPARATION + booking.getStartDate() + SEPARATION +
                booking.getEndDate() + SEPARATION + booking.getCustomerCode() + SEPARATION + booking.getFacility()), "D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\booking.csv");
    }

    @Override
    public void displayListBooking() {
        readAndWriteFile.readFileObject("D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\booking.csv");
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer cheeseCustommer() {
        System.out.println("Custommer list: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.print("Enter customer ID: ");
        boolean check = true;
        int id = Integer.parseInt(sc.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == Integer.parseInt(customer.getID())) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.print("You entered incorrectly, please re-enter customer ID: ");
                id = Integer.parseInt(sc.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Facility list: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.print("Enter Facility ID: ");
        boolean check = true;
        String id = sc.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getID())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.print("You entered incorrectly, please re-enter customer ID: ");
                id = sc.nextLine();
            }
        }
        return null;
    }

//    public static Villa chooseVilla() {
//        System.out.println("Villa list: ");
//        for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {
//            System.out.println(entry.toString());
//        }
//        System.out.print("Enter Villa ID: ");
//        boolean check = true;
//        String id = sc.nextLine();
//        while (check) {
//            for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {
//                if (id.equals(entry.getKey().getID())) {
//                    check = false;
//                    return entry.getKey();
//                }
//            }
//            if (check) {
//                System.out.print("You entered incorrectly, please re-enter customer ID: ");
//                id = sc.nextLine();
//            }
//        }
//        return null;
//    }

//    public static Room chooseRoom() {
//        System.out.println("Room list: ");
//        for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
//            System.out.println(entry.toString());
//        }
//        System.out.print("Enter Room ID: ");
//        boolean check = true;
//        String id = sc.nextLine();
//        while (check) {
//            for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
//                if (id.equals(entry.getKey().getID())) {
//                    check = false;
//                    return entry.getKey();
//                }
//            }
//            if (check) {
//                System.out.print("You entered incorrectly, please re-enter customer ID: ");
//                id = sc.nextLine();
//            }
//        }
//        return null;
//    }
//
//    public static House chooseHouse() {
//        System.out.println("House list: ");
//        for (Map.Entry<House, Integer> entry : houseIntegerMap.entrySet()) {
//            System.out.println(entry.toString());
//        }
//        System.out.print("Enter Facility Name: ");
//        boolean check = true;
//        String id = sc.nextLine();
//        while (check) {
//            for (Map.Entry<House, Integer> entry : houseIntegerMap.entrySet()) {
//                if (id.equals(entry.getKey().getID())) {
//                    check = false;
//                    return entry.getKey();
//                }
//            }
//            if (check) {
//                System.out.print("You entered incorrectly, please re-enter customer ID: ");
//                id = sc.nextLine();
//            }
//        }
//        return null;
//    }
}
