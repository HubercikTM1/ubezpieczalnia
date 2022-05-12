package com.company.classes.exceptions;

public class IllegalStateException extends RuntimeException{

    public IllegalStateException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
