package case_study.models;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String ID;
    private String name;
    private String birthday;
    private String gender;
    private long IDCard;
    private long phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String ID, String name, String birthday, String gender, long IDCard, long phoneNumber, String email) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.IDCard = IDCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getIDCard() {
        return IDCard;
    }

    public void setIDCard(long IDCard) {
        this.IDCard = IDCard;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "ID : " + ID +
                ", Name : " + name + '\'' +
                ", Birthday : " + birthday + '\'' +
                ", Gender : " + gender + '\'' +
                ", ID Card : " + IDCard +
                ", Phone Number : " + phoneNumber +
                ", Email : " + email;
    }
}
