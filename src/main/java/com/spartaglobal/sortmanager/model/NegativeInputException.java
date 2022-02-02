package com.spartaglobal.sortmanager.model;

public class NegativeInputException extends RuntimeException{
    public NegativeInputException (String message, Throwable cause){
        super(message, cause);
    }
}
