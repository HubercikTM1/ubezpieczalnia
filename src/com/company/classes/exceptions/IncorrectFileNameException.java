package com.company.classes.exceptions;

public class IncorrectFileNameException extends Exception{

    public IncorrectFileNameException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
