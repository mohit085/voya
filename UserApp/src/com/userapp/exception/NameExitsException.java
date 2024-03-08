package com.userapp.exception;

public class NameExitsException extends Exception{
    public NameExitsException() {
    }

    public NameExitsException(String message) {
        super(message);
    }
}
