package com.objects.inheritance;

public class FinMain {
    public static void main(String[] args) {

        TeamOne teamOne = new TeamOne("Policybazar",12,"banking","rahul","Java full Stack");
        String[] techstack = teamOne.showTechStack();

        for(String tech : techstack){
            System.out.print(tech+" ");
        }
        System.out.println();

        TeamTwo teamTwo = new TeamTwo("Policybazar",12,"banking","rahul",new String[]{"Junit","Maven","Git","Docker"});
        teamTwo.showSupportTools();
    }
}
