package com.oops.inheritance;

public class InEmployee {

    String employeename;
    int employeeId;

    InEmployee(String employeename,int employeeId){
       this.employeename=employeename;
       this.employeeId=employeeId;
    }
    void getDetails(){
        System.out.println(employeename+" "+employeeId);

    }
}
