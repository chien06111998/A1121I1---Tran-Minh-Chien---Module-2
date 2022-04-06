package case_study.models;

public class House extends Facility{
    private String serviceName;
    private double areaOfUse;
    private double rentalExpenses;
    private int maximumPeople;
    private String rentalStyle;

    public House() {
    }

    public House(String serviceName, double areaOfUse, double rentalExpenses, int maximumPeople, String rentalStyle) {
        this.serviceName = serviceName;
        this.areaOfUse = areaOfUse;
        this.rentalExpenses = rentalExpenses;
        this.maximumPeople = maximumPeople;
        this.rentalStyle = rentalStyle;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaOfUse() {
        return areaOfUse;
    }

    public void setAreaOfUse(double areaOfUse) {
        this.areaOfUse = areaOfUse;
    }

    public double getRentalExpenses() {
        return rentalExpenses;
    }

    public void setRentalExpenses(double rentalExpenses) {
        this.rentalExpenses = rentalExpenses;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalStyle() {
        return rentalStyle;
    }

    public void setRentalStyle(String rentalStyle) {
        this.rentalStyle = rentalStyle;
    }

    @Override
    public String toString() {
        return "House: " +
                "\nService Name : " + serviceName +
                "\nArea Of Use : " + areaOfUse +
                "\nRental Expenses : " + rentalExpenses +
                "\nMaximum People : " + maximumPeople +
                "\nRental Style : " + rentalStyle;
    }

    @Override
    public void roomStandard() {

    }

    @Override
    public double poolArea() {
        return 0;
    }

    @Override
    public int numberOfFloors() {
        return 0;
    }

    @Override
    public void freeService() {

    }
}
