package com.objects.inheritance;

public class TeamOne extends  Project{
    String techstack;

    TeamOne(String projectName,int durationinMonths,String domain,String projectManager,String techstack){
        super(projectName,durationinMonths,domain,projectManager);
        this.techstack=techstack;
    }
    String[] showTechStack(){
        String[] techStackArray = {"Java","Sql","Git"};
        return techStackArray;
    }

}
