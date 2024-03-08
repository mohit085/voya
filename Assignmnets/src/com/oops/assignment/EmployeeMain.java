//package com.oops.assignment;
//import java.util.Scanner;
//public class EmployeeMain {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Employee[] emplist = new Employee[3];
//        for (int i = 0; i < emplist.length; i++) {
//            String name = sc.next();
//            String desg = sc.next();
//
//            emplist[i] = new Employee(name, desg);
//        }
//        System.out.println("Enter Your Choice");
//        String choice = sc.next();
//        for (Employee abc : emplist) {
//            switch (choice) {
//                case (choice.equals("programmer")) :
//                    System.out.println(abc.calcBonus(2200));
//                        break;
//                case  (choice.equals("manager")) :
//                    System.out.println(abc.calcBonus(2200, 200, "car"));
//                    break;
//                case (choice.equals("director")) :
//                    System.out.println(abc.calcBonus(2200, 220, 200, "Laptop"));
//                    break;
//                }
//            }
//    }

//    }
//}
