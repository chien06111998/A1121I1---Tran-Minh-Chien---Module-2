package case_study.services.impl;

import case_study.models.Facility;
import case_study.services.FacilityService;
import case_study.utils.ReadAndWriteFile;
import case_study.utils.RegexData;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.plaf.PanelUI;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Scanner sc = new Scanner(System.in);
    private static Map<Facility, Integer> facilityMap= new LinkedHashMap<>();

    static final String SEPARATION = ", ";

    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\D]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\D]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\D]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20$)";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static final String REGEX_FLOORS = "^[1-9]|([1][0-9])$";


    @Override
    public void addNewVilla() {
        System.out.println("<<-------------Enter a list of Villa------------->>");
        String ID = inputIDVL();
        String serviceName = inputName();
        double areaOfUse = Double.parseDouble(inputArea());
        double rentalExpenses = Double.parseDouble(inputTotalPay());
        int maximumPeople = Integer.parseInt(inputMax());
        String rentalStyle = inputName();
        String roomStander = inputName();
        double poolArea = Double.parseDouble(inputArea());
        int numberOfPloors = Integer.parseInt(inputFloors());
    }

    @Override
    public void addNewHouse() {
        System.out.println("<<-------------Enter a list of House------------->>");
        String ID = inputIDHO();
        String serviceName = inputName();
        double areaOfUse = Double.parseDouble(inputArea());
        double rentalExpenses = Double.parseDouble(inputTotalPay());
        int maximumPeople = Integer.parseInt(inputMax());
        String rentalStyle = inputName();
        String roomStander = inputName();
        int numberOfPloors = Integer.parseInt(inputFloors());
    }

    @Override
    public void addNewRoom() {
        System.out.println("<<-------------Enter a list of Room------------->>");
        String ID = inputIDRO();
        String serviceName = inputName();
        double areaOfUse = Double.parseDouble(inputArea());
        double rentalExpenses = Double.parseDouble(inputTotalPay());
        int maximumPeople = Integer.parseInt(inputMax());
        String rentalStyle = inputName();
        String freeService = inputName();
    }

    private String inputIDVL () {
        System.out.print("Enter ID: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_ID_VILLA, "If you enter the wrong format, the ID facility must be in the form: SVXX-YYYY.");
    }

    private String inputIDHO () {
        System.out.print("Enter ID: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_ID_HOUSE, "If you enter the wrong format, the ID facility must be in the form: SVXX-YYYY.");
    }

    private String inputIDRO () {
        System.out.print("Enter ID: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_ID_ROOM, "If you enter the wrong format, the ID facility must be in the form: SVXX-YYYY.");
    }

    private String inputName () {
        System.out.print("Enter name: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_STR, "If you enter the wrong format, The first letter of the name must be capitalized.");
    }

    private String inputArea () {
        System.out.print("Enter area: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_AREA, "If you enter the wrong format, the area must be more than 30 square meters.");
    }

    private String inputMax() {
        System.out.print("Enter max people: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_AMOUNT, "If you enter the wrong format, The maximum number of people must be 0 and less than 20.");
    }

    private String inputTotalPay() {
        System.out.print("Enter total pay: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_INT, "If you enter the wrong format, rental cost must be positive.");
    }

    private String inputFloors() {
        System.out.print("Enter total pay: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_FLOORS, "If you enter the wrong format, rental cost must be positive.");
    }

    @Override
    public void displayFacility() {
        //readAndWriteFile.readFileObject("D:\\A1121I1 - TranMinhChien-MD2\\java_core\\src\\case_study\\data\\facility.csv");
        Set<Map.Entry<Facility, Integer>> entries = facilityMap.entrySet();
        for (Map.Entry<Facility, Integer> entry : entries) {
            System.out.print(entry.toString() + "\n");
        }
    }

    @Override
    public void maintenanceFacility() {

    }
}
