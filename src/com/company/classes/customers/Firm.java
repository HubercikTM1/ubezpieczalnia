package com.company.classes.customers;

import com.company.classes.Address;
import com.company.classes.CustomerClass;

public class Firm extends CustomerClass {

    private String NIP;
    private String REGON;
    private boolean representative;


    //CONSTRUCTOR
    public Firm(int id, String name, String surname, String phone, Address address, String NIP, String REGON, boolean representative) {
        super(id, name, surname, phone, address);
        this.NIP = NIP;
        this.REGON = REGON;
        this.representative = representative;
    }

    //GETTERS
    public String getNIP() { return NIP; }
    public String getREGON() { return REGON; }
    public boolean isRepresentative() { return representative; }


    //SETTERS
    public void setNIP(String NIP) { this.NIP = NIP; }
    public void setREGON(String REGON) { this.REGON = REGON; }
    public void setRepresentative(boolean representative) { this.representative = representative; }
}
