package com.exceptions.basic;

public class BasicEx {
    public static void main(String[] args) {
        try {
            System.out.println("welcome");
            String value = args[0];
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int result = 100 / num;
            System.out.println(result);

            int marks[] = null;
            System.out.println(marks[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("please  enter value");

        } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Do  not enter 0");

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("please enter a number");

        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("continue.....");
    }
}
