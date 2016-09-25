package com.example.studentapp;

/**
 * Created by St1nger13 on 25.09.2016.
 */
public class Student {
    private String name ;
    private int grade ;

    public Student(String name) {
        this.setName(name) ;
        this.setGrade(0) ;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public void setGrade(int grade) {
        this.grade = grade ;
    }

    public String getGradeAsLetter() {
        if(grade > 89)
            return "A" ;
        else
            if(grade > 79)
                return "B" ;
            else
                if(grade > 69)
                    return "C" ;
                else
                    if(grade > 59)
                        return "D" ;
                    else
                        return "F" ;
    }
}
