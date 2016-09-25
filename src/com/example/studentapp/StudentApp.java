package com.example.studentapp;

public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student("Christopher") ;
        student1.setGrade(67) ;

        System.out.println(student1.getGradeAsLetter()) ;
        student1.setGrade(50) ;

        System.out.println(student1.getGradeAsLetter()) ;
    }
}
