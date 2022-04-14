package case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String ID, String serviceName, double areaOfUse, double rentalExpenses, int maximumPeople, String rentalStyle, String roomStandard, int numberOfFloors) {
        super(ID, serviceName, areaOfUse, rentalExpenses, maximumPeople, rentalStyle);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                ", Room Standard : " + roomStandard +
                ", Number Of Floors : " + numberOfFloors;
    }
}
