package com.util.list;

import java.util.*;
//import java.util.List;
//import java.util.ArrayList;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("mohit",85,"patna");
        Customer customer2 = new Customer("sahil",86,"bangalore");
        Customer customer3 = new Customer("anish",87,"bangalore");
        Customer customer4 = new Customer("ayush",88,"gorakhpur");
        Customer customer5 = new Customer("ram",89,"bangalore");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        List<Customer> customercity = new ArrayList<>();

        for (Customer customer : customerList){
            if(customer.getCity().equalsIgnoreCase("bangalore")){
                customercity.add(customer);
            } else{
                continue;
            }

        }

        ListIterator<Customer> iter = customercity.listIterator(customercity.size());
        while (iter.hasPrevious()){
            Customer print = iter.previous();
            System.out.println(print);
        }

//        Collections.sort(customercity);

    }
}
