package com.company.classes.exceptions;

public class SQLException extends Exception{

    public SQLException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
