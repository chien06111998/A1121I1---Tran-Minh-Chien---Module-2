package case_study.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String ID, String serviceName, double areaOfUse, double rentalExpenses, int maximumPeople, String rentalStyle, String freeService) {
        super(ID, serviceName, areaOfUse, rentalExpenses, maximumPeople, rentalStyle);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room:" + super.toString() +
                ", Free Service : " + freeService;
    }
}
