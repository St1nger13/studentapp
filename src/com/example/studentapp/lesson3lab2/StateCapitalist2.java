package com.example.studentapp.lesson3lab2;

import java.util.HashMap;

/**
 * Created by St1nger13 on 25.09.2016.
 */
public class StateCapitalist2 {
    private static HashMap<String, Capital> states = new HashMap<String, Capital>() ;

    public static void main(String ... args) {

        fillUpStatesMap() ;

        printAllStates() ;

        printOnlyStatesWithPopulationOver(500) ;
    }

    public static void fillUpStatesMap() {
        states.put("Alabama", new Capital("Alabama", 4858979, 51419)) ;

        // ...
        // TODO: fill up states here
    }

    public static void printAllStates() {
        for(Capital c : states.values()) {
            System.out.println(
                      c.getName() + " | Population: "
                    + c.getPopulation() + " | Sq Miles: "
                    + c.getSquareMileage()) ;
        }
    }

    public static void printOnlyStatesWithPopulationOver(int value) {
        for(Capital c : states.values()) {
            if(c.getPopulation() > value) {
                System.out.println(
                        c.getName() + " | Population: "
                                + c.getPopulation() + " | Sq Miles: "
                                + c.getSquareMileage());
            }
        }
    }
}
