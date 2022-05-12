package com.company.classes.exceptions;

public class IncorrectFileExtensionException extends RuntimeException{

    public IncorrectFileExtensionException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
