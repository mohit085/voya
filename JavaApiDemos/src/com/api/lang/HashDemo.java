package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("x100","Audi","white");
        Vehicle v2 = new Vehicle("x100","Audi","black");
        Vehicle v3 = new Vehicle("A100","Audi","black");
        Vehicle v4 = new Vehicle("x100","Audi","white");

        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));
//        System.out.println(v2.equals(v3));
        System.out.println(v1.equals(v4));

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
        System.out.println(v4.hashCode());


    }
}
