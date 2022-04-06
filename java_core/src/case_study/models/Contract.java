package case_study.models;

public class Contract {
    private String numberOfContracts;
    private String customerCode;
    private String IDBooking;
    private long deposit;
    private long totalAmount;

    public Contract() {
    }

    public Contract(String numberOfContracts, String customerCode, String IDBooking, long deposit, long totalAmount) {
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

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "\nNumber Of Contracts : " + numberOfContracts +
                "\nCustomer Code : " + customerCode +
                "\nID Booking : " + IDBooking +
                "\nDeposit : " + deposit +
                "\nTotal Amount : " + totalAmount;
    }
}
