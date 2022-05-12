package com.company.classes.exceptions;

public class UnauthorizedException extends Exception{

    public UnauthorizedException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
