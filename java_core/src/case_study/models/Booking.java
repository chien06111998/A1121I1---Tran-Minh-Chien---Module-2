package case_study.models;

import java.io.Serializable;

public class Booking implements Serializable {
    private Integer IDBooking;
    private String startDate;
    private String endDate;
    private Customer customerCode;
    private Facility facility;

    public Booking() {
    }

    public Booking(Integer IDBooking, String startDate, String endDate, Customer customerCode, Facility facility) {
        this.IDBooking = IDBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.facility = facility;
    }


    public Integer getIDBooking() {
        return IDBooking;
    }

    public void setIDBooking(Integer IDBooking) {
        this.IDBooking = IDBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Customer customerCode) {
        this.customerCode = customerCode;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking : " +
                "ID Booking : " + IDBooking +
                ", Start Date : " + startDate +
                ", End Date : " + endDate +
                ", " + customerCode +
                ", " + facility;
    }
}
