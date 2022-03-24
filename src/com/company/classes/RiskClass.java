package com.company.classes;

import com.company.enums.PolicyType;

import java.util.Date;

public class RiskClass {

    private int id;
    private double price_from;
    private double price_to;
    private Date security_from;
    private Date security_to;
    private String description;
    private PolicyType policyType;


    //CONSTRUCTOR
    public RiskClass(int id, double price_from, double price_to, Date security_from, Date security_to, String description, PolicyType policyType) {
        this.id = id;
        this.price_from = price_from;
        this.price_to = price_to;
        this.security_from = security_from;
        this.security_to = security_to;
        this.description = description;
        this.policyType = policyType;
    }


    //GETTERS
    public int getId() {
        return id;
    }
    public double getPrice_from() {
        return price_from;
    }
    public double getPrice_to() {
        return price_to;
    }
    public Date getSecurity_from() {
        return security_from;
    }
    public Date getSecurity_to() {
        return security_to;
    }
    public String getDescription() {
        return description;
    }
    public PolicyType getPolicyType() {
        return policyType;
    }


    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setPrice_from(double price_from) {
        this.price_from = price_from;
    }
    public void setPrice_to(double price_to) {
        this.price_to = price_to;
    }
    public void setSecurity_from(Date security_from) {
        this.security_from = security_from;
    }
    public void setSecurity_to(Date security_to) {
        this.security_to = security_to;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

}
