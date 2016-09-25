package com.example.studentapp.machineex;

/**
 * Created by St1nger13 on 25.09.2016.
 */
public abstract class Machine {
    protected int yearModel ;
    protected String make ;
    protected int speed ;

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
