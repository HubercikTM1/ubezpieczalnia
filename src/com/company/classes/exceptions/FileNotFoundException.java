package com.company.classes.exceptions;

import java.io.IOException;

public class FileNotFoundException extends IOException {

    public FileNotFoundException(String errMessage){
        super(errMessage);
    }

}
