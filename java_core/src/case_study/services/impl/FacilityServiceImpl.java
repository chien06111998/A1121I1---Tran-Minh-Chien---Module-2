package case_study.services.impl;

import case_study.models.Facility;
import case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    private static Map<Facility, Integer> facilityMap= new LinkedHashMap<>();
    @Override
    public void addNewCacility() {
        String serviceName, rentalStyle;
        double areaOfUse, rentalExpenses;
        int maximumPeople;
        System.out.println("<<-------------Enter a list of Facility------------->>");
        System.out.print("Enter facility service name: ");
        serviceName = sc.nextLine();
        System.out.print("Enter facility area of use: ");
        areaOfUse = Double.parseDouble(sc.nextLine());
        System.out.print("Enter facility rental expenses: ");
        rentalExpenses = Double.parseDouble(sc.nextLine());
        System.out.print("Enter facility maximum people: ");
        maximumPeople = Integer.parseInt(sc.nextLine());
        System.out.print("Enter facility rental style: ");
        rentalStyle = sc.nextLine();

    }

    @Override
    public void displayFacility() {
//        for (Facility facility : facilityMap) {
//
//        }
    }

    @Override
    public void maintenanceFacility() {

    }
}
