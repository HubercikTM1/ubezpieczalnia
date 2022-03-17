package com.company.classes;

import java.util.UUID;

public class CustomerClass {

    private int id;
    private String name;
    private String surname;
    private String phone;
    private Address address;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPhone() { return phone; }
    public Address getAddress() { return address; }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(Address address) { this.address = address; }
}
