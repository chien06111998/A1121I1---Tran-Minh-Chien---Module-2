package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String ID, String serviceName, double areaOfUse, double rentalExpenses, int maximumPeople, String rentalStyle, String roomStandard, double poolArea, int numberOfFloors) {
        super(ID, serviceName, areaOfUse, rentalExpenses, maximumPeople, rentalStyle);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa: " +
                super.toString() +
                ", Room Standard : " + roomStandard +
                ", Pool Area : " + poolArea +
                ", Number Of Floors : " + numberOfFloors;
    }
}
