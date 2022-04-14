package case_study.models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String ID, String name, String birthday, String gender, long IDCard, long phoneNumber, String email, String customerType, String address) {
        super(ID, name, birthday, gender, IDCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer:" + super.toString() +
                ", Customer Type : " + customerType + '\'' +
                ", address: " + address;
    }
}
