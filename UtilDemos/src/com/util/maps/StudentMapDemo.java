package com.util.maps;

import java.util.*;

public class StudentMapDemo {
    public static void main(String[] args) {
        Map<Department,List<Student>> studentmap = new HashMap<>();
        Department department1 = new Department("Jo",1,"CSE");
        Department department2 = new Department("Rahul",2,"ECE");
        Department department3 = new Department("Murali",3,"IT");
//        Department department4 = new Department("Murali",3,"IT");


        studentmap.put(department1,Arrays.asList(new Student("Ram","Bangalore"),new Student("Mohit","Patna"),new Student("Ayush","UP")));
        studentmap.put(department2,Arrays.asList(new Student("Roni","Chennai"),new Student("Sasi","Chennai"),new Student("Ayush","UP")));
        studentmap.put(department3,Arrays.asList(new Student("Kayal","Ooty"),new Student("Kavya","Chennai"),new Student("Ayush","UP")));

//        studentmap.put(department4,null);

        Set<Department> departments = studentmap.keySet();
        for(Department department : departments){
            System.out.println(department.getDepHead()+" "+department.getDepName());

            // department is key
            List<Student> students =  studentmap.get(department);
            for(Student student : students){
                System.out.println(student.getStudname());
            }
        }
    }
}
