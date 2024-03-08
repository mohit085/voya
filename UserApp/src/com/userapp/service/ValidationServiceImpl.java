package com.userapp.service;

import com.userapp.exception.NameExitsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService{


    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if(password.length() >= 16) throw new TooLongException("password is  too long");
        if(password.length() <=5) throw new TooShortException("password is  too short");
        return true;
    }

    @Override
    public boolean validateUsername(String username) throws NameExitsException {
        String[] usernameList = {"mohit","sahil","ayush","vineet"};
        for(String Name : usernameList) {
            if(Name.equalsIgnoreCase(username)) {
                throw new NameExitsException("name already exits");
            }
        }
        return true;
    }
}
