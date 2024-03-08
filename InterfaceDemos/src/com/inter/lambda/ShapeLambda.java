package com.inter.lambda;

import com.inter.anony.IShape;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape ishape = (int x, int  y) ->{
            System.out.println("Rect "+(x+y));
        };
        ishape.area(10,20);

        ishape = ((x, y) -> System.out.println("Tri "+(0.5*x*y)));
        ishape.area(20,20);
    }
}
