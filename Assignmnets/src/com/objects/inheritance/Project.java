package com.objects.inheritance;

public class Project {
    String projectName;
    int durationinMonths;

    String domain;
    String projectManager;

    Project(String projectName,int durationinMonths,String domain,String projectManager){
        this.projectName=projectName;
        this.durationinMonths=durationinMonths;
        this.domain=domain;
        this.projectManager=projectManager;
    }

    void showProjectDetails(){
        System.out.println("ProjectName "+ projectName);
        System.out.println("Duration in Months "+ durationinMonths);
        System.out.println("Domain "+ domain);
        System.out.println("ProjectManager "+ projectManager);
    }
}
