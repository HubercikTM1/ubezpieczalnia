package com.company.classes;

import java.util.UUID;

public abstract class CustomerClass {

    private int id;
    private String name;
    private String surname;
    private String phone;
    private Address address;


    //CONSTRUCTOR
    public CustomerClass(int id, String name, String surname, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    //GETTERS
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPhone() { return phone; }
    public Address getAddress() { return address; }

    //SETTERS
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
