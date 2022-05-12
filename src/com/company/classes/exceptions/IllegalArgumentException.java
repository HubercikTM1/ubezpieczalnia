package com.company.classes.exceptions;

public class IllegalArgumentException extends RuntimeException{

    public IllegalArgumentException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
