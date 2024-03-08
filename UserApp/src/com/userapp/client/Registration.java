package com.userapp.client;

import com.userapp.exception.NameExitsException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String username = sc.next();

        IValidationService iValidationService = new ValidationServiceImpl();

        try {
            if(iValidationService.validateUsername(username)) {
                System.out.println("Welcome User "+username);
                System.out.println("Enter Passwword: ");
                String password = sc.next();
                if(iValidationService.validatePassword(password)) {
                    System.out.println("you have enetred correct password,Access  Granted!!!");
                }
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
