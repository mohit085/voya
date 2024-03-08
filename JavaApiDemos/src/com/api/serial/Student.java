package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static  final long serialVersionUID = 2L;
    private String Name;
    private int Id;
    private  transient  String Dept;
    public Student() {
        super();
    }

    public Student(String name, int id, String dept) {
        super();
        Name = name;
        Id = id;
        Dept = dept;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
