package com.company.classes.exceptions;

public class ClassNotFoundException extends ReflectiveOperationException{

    public ClassNotFoundException(String errMessage, Throwable cause){
        super(errMessage, cause);
    }

}
