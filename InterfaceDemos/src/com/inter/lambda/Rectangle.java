package com.inter.lambda;

public class Rectangle implements IShape{
    @Override
    public void area(int x, int y) {
        System.out.println(x*y);
    }
}
