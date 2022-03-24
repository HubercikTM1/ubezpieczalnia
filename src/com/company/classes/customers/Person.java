package com.company.classes.customers;

import com.company.classes.Address;
import com.company.classes.CustomerClass;

public class Person extends CustomerClass {

    private String pesel;

    //CONSTRUCTOR
    public Person(int id, String name, String surname, String phone, Address address, String pesel) {
        super(id, name, surname, phone, address);
        this.pesel = pesel;
    }

    //GETTERS
    public String getPesel() { return pesel; }

    //SETTERS
    public void setPesel(String pesel) { this.pesel = pesel; }
}
