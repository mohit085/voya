package com.inter.lambda;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse webcourse = () ->{
          return new String[]{"html","css","bootstrap"};
        };
        String[] print =webcourse.showCourses();
        for (String value:print ){
            System.out.println(value);
        }

        ICourse cloudCourse = () -> {
            return new String[]{"aws","googlecloud","azure"};
        };
        cloudCourse.showCourses();

        for (String value: cloudCourse.showCourses()){
            System.out.println(value);
        }

        ICourse javacourse = () -> {
            return new String[]{"java","spring","junit"};
        };
        javacourse.showCourses();

        for (String value:javacourse.showCourses() ){
            System.out.println(value);
        }
    }
}
