package com.inter.anony;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape rectangle = new IShape() {

            @Override
            public void area(int x, int y) {
                System.out.println("Area of recatangle is "+(x*y));
            }
        };
        rectangle.area(10,20);

        rectangle = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area of rectangle is "+(x*y*0.5));
            }
        };
        rectangle.area(10,20);
    }
}
