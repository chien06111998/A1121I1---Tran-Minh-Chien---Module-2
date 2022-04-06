package case_study.models;

public class Booking {
    private String IDBooking;
    private String startDate;
    private String endDate;
    private String customerCode;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String IDBooking, String startDate, String endDate, String customerCode, String serviceName, String serviceType) {
        this.IDBooking = IDBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getIDBooking() {
        return IDBooking;
    }

    public void setIDBooking(String IDBooking) {
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking : " +
                "\nID Booking='" + IDBooking +
                "\nStart Date='" + startDate +
                "\nEnd Date='" + endDate +
                "\nCustomer Code='" + customerCode +
                "\nService Name='" + serviceName +
                "\nService Type='" + serviceType ;
    }
}
