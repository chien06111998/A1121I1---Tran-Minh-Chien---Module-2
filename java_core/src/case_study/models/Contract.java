package case_study.models;

import java.io.Serializable;

public class Contract implements Serializable {
    private String numberOfContracts;
    private String customerCode;
    private String IDBooking;
    private String deposit;
    private String totalAmount;

    public Contract() {
    }

    public Contract(String numberOfContracts, String customerCode, String IDBooking, String deposit, String totalAmount) {
        this.numberOfContracts = numberOfContracts;
        this.customerCode = customerCode;
        this.IDBooking = IDBooking;
        this.deposit = deposit;
        this.totalAmount = totalAmount;
    }

    public String getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(String numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getIDBooking() {
        return IDBooking;
    }

    public void setIDBooking(String IDBooking) {
        this.IDBooking = IDBooking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "Number Of Contracts : " + numberOfContracts +
                ", ID Booking : " + IDBooking +
                ", Customer Code : " + customerCode +
                ", Deposit : " + deposit +
                ", Total Amount : " + totalAmount;
    }
}
