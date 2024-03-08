package com.inter.lambda;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory  factory = new ShapeFactory();

        // creating a reference of IShape

        IShape shape = new Rectangle();
        //pass this as parameter
        factory.printArea(shape,10,20);
        System.out.println();

        //using anonymous inner class
        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area");
                System.out.println("Tri "+ (x*y*0.5));
            }
        },10,40);
        System.out.println("...............");

        //using lambda expression

        factory.printArea((int x,int y) -> {
            System.out.println("calculating square area");
            System.out.println("Sq "+(x*x));
        },2,4);
    }
}
