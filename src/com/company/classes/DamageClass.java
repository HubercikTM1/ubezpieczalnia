package com.company.classes;

import com.company.enums.DamageType;

public class DamageClass {

    private int id;
    private PolicyClass policyClass;
    private String documents;
    private DamageType damageType;
    private CustomerClass victim;


    //CONSTRUCTOR
    public DamageClass(int id, PolicyClass policyClass, String documents, DamageType damageType, CustomerClass victim) {
        this.id = id;
        this.policyClass = policyClass;
        this.documents = documents;
        this.damageType = damageType;
        this.victim = victim;
    }


    //GETTERS
    public int getId() {
        return id;
    }
    public PolicyClass getPolicyClass() {
        return policyClass;
    }
    public String getDocuments() {
        return documents;
    }
    public DamageType getDamageType() {
        return damageType;
    }
    public CustomerClass getVictim() {
        return victim;
    }


    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setPolicyClass(PolicyClass policyClass) {
        this.policyClass = policyClass;
    }
    public void setDocuments(String documents) {
        this.documents = documents;
    }
    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }
    public void setVictim(CustomerClass victim) {
        this.victim = victim;
    }

}
