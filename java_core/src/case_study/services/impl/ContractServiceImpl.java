package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.services.ContactService;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static final String SEPARATION = ", ";

    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingSerciveImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomerCode();
            System.out.println("Creating a contract for booking: " + booking.toString());
            System.out.println("Creating a contract for customer: " + customer.toString());
            System.out.print("Enter ID Contract: ");
            String ID = sc.nextLine();
            System.out.print("Enter the upfront amount: ");
            String amount = sc.nextLine();
            System.out.print("Enter the total cost: ");
            String cost = sc.nextLine();
            Contract contract = new Contract(ID, String.valueOf(booking.getIDBooking()), customer.getID(), amount, cost);
            //contractList.add(contract);
            readAndWriteFile.writeFileObject(Collections.singletonList(contract.getNumberOfContracts() + SEPARATION + contract.getIDBooking() + SEPARATION +
                    contract.getCustomerCode() + SEPARATION + contract.getDeposit() + SEPARATION + contract.getTotalAmount()), "D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\contract.csv");
            //System.out.println("Create a successful contract: " + contract.toString());
        }
    }

    @Override
    public void displayListContract() {
        readAndWriteFile.readFileObject("D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\contract.csv");
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {
        System.out.print("Enter the contract ID to edit: ");
        String ID_edit = sc.nextLine();
        for (int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).getNumberOfContracts().equals(ID_edit)) {
                System.out.print("Enter contract ID edit: ");
                contractList.get(i).setNumberOfContracts(sc.nextLine());
                System.out.print("Enter ID customer edit: ");
                contractList.get(i).setCustomerCode(sc.nextLine());
                System.out.print("Enter ID booking edit: ");
                contractList.get(i).setIDBooking(sc.nextLine());
                System.out.print("Enter deposit edit: ");
                contractList.get(i).setDeposit(sc.nextLine());
                System.out.print("Enter amount edit: ");
                contractList.get(i).setTotalAmount(sc.nextLine());
            } else {
                System.out.println("ID = " + ID_edit + " not existed.");
            }
        }
    }
}
