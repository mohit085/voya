package com.util.maps;

import java.util.*;
public class Department {
    private String  depName;
    private int depId;
    private String depHead;

    public Department() {
        super();
    }

    public Department(String depName, int depId, String depHead) {
        super();
        this.depName = depName;
        this.depId = depId;
        this.depHead = depHead;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepHead() {
        return depHead;
    }

    public void setDepHead(String depHead) {
        this.depHead = depHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depName='" + depName + '\'' +
                ", depId='" + depId + '\'' +
                ", depHead='" + depHead + '\'' +
                '}';
    }
}
