package com.oops.overriding;

public class Outdoor extends Sports {
    @Override
    String[] showTypes() {

        return new String[]{"cricket", "football", "shuttle"};
    }
}
