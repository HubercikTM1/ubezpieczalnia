package com.company.classes;

public class Address {

    private String street;
    private String city;
    private String postcode;

    //CONSTRUCTOR
    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    //GETTERS
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPostcode() {
        return postcode;
    }


    //SETTERS
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
