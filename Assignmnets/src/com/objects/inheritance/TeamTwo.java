package com.objects.inheritance;

public class TeamTwo  extends Project{

    String[] tools;

    TeamTwo(String projectName,int durationinMonths,String domain,String projectManager,String[] tools){
       super(projectName,durationinMonths,domain,projectManager);
       this.tools=tools;
    }

    void showSupportTools(){
        for(String arr : tools){
            System.out.println(arr);
        }
    }



}
