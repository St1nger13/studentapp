package com.example.studentapp.lesson3lab2;

/**
 * Created by St1nger13 on 25.09.2016.
 */
public class Capital {
    private String name ;
    private int population ;
    private int squareMileage ;

    public Capital(String name, int population, int squareMileage) {
        this.name = name ;
        this.population = population ;
        this.squareMileage = squareMileage ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquareMileage() {
        return squareMileage;
    }

    public void setSquareMileage(int squareMileage) {
        this.squareMileage = squareMileage;
    }
}
