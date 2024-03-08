package com.util.maps;

public class Student {
    private String studname;
    private String city;

    public Student() {
        super();
    }

    public Student(String studname, String city) {
        super();
        this.studname = studname;
        this.city = city;
    }

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studname='" + studname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
