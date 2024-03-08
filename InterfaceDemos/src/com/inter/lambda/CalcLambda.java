package com.inter.lambda;

public class CalcLambda {
    public static void main(String[] args) {

        IMyCalculator mycalc = (int x ,int y) -> {
            return (x+y);
        };
        System.out.println(mycalc.calculate(1,2));

        mycalc = (x,y) -> x-y;
        System.out.println(mycalc.calculate(2,1));

        mycalc = (x,y) -> x*y;
        System.out.println(mycalc.calculate(2,1));

        mycalc = (x,y) -> x/y;
        System.out.println(mycalc.calculate(2,1));

        mycalc = (x,y) -> x*x;
        System.out.println(mycalc.calculate(2,1));

    }
}
