package com.util.list;

public class Customer {
    private String name;
    private int customerid;
    private  String city;

    public Customer() {
    }

    public Customer(String name, int customerid, String city) {
        this.name = name;
        this.customerid = customerid;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustimerid() {
        return customerid;
    }

    public void setCustimerid(int custimerid) {
        this.customerid = custimerid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", custimerid=" + customerid +
                ", city='" + city + '\'' +
                '}';
    }
}
