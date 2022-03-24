package com.company.classes;

import java.util.Date;

public class EventClass {

    private int id;
    private Date eventDate;
    private DamageClass damageClass;
    private String eventPlace;
    private String process;


    //CONSTRUCTOR
    public EventClass(int id, Date eventDate, DamageClass damageClass, String eventPlace, String process) {
        this.id = id;
        this.eventDate = eventDate;
        this.damageClass = damageClass;
        this.eventPlace = eventPlace;
        this.process = process;
    }


    //GETTERS
    public int getId() {
        return id;
    }
    public Date getEventDate() {
        return eventDate;
    }
    public DamageClass getDamageClass() {
        return damageClass;
    }
    public String getEventPlace() {
        return eventPlace;
    }
    public String getProcess() {
        return process;
    }


    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    public void setDamageClass(DamageClass damageClass) {
        this.damageClass = damageClass;
    }
    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }
    public void setProcess(String process) {
        this.process = process;
    }

}
