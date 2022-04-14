package io_binaryfile_serilazation.thuc_hanh.bai_tap;

import java.io.Serializable;

public class Management implements Serializable {
    public String id_management;
    public String name_management;
    public String manufacturer;
    public String price;
    public String other_description;

    public Management() {
    }

    public Management(String id_management, String name_management, String manufacturer, String price, String other_description) {
        this.id_management = id_management;
        this.name_management = name_management;
        this.manufacturer = manufacturer;
        this.price = price;
        this.other_description = other_description;
    }

    public String getId_management() {
        return id_management;
    }

    public void setId_management(String id_management) {
        this.id_management = id_management;
    }

    public String getName_management() {
        return name_management;
    }

    public void setName_management(String name_management) {
        this.name_management = name_management;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOther_description() {
        return other_description;
    }

    public void setOther_description(String other_description) {
        this.other_description = other_description;
    }

    @Override
    public String toString() {
        return "Management: " +
                "id_management : " + id_management +
                ", name_management : " + name_management +
                ", manufacturer : " + manufacturer +
                ", price = " + price +
                ", other_description : " + other_description;
    }
}
