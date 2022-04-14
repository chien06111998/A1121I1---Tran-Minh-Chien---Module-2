package case_study.models;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String ID;
    private String serviceName;
    private double areaOfUse;
    private double rentalExpenses;
    private int maximumPeople;
    private String rentalStyle;

    public Facility() {
    }

    public Facility(String ID, String serviceName, double areaOfUse, double rentalExpenses, int maximumPeople, String rentalStyle) {
        this.ID = ID;
        this.serviceName = serviceName;
        this.areaOfUse = areaOfUse;
        this.rentalExpenses = rentalExpenses;
        this.maximumPeople = maximumPeople;
        this.rentalStyle = rentalStyle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        return "Facility{" +
                "ID : " + ID +
                ", Service Name : " + serviceName +
                ", Area Of Use : " + areaOfUse +
                ", Rental Expenses : " + rentalExpenses +
                ", Maximum People : " + maximumPeople +
                ", Rental Style : " + rentalStyle;
    }
}
