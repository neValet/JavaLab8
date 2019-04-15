package ua.lviv.iot.gym2.models;

import ua.lviv.iot.gym2.enums.MusclesGroup;

import javax.persistence.*;

@Entity
@Inheritance
public class Racetrack extends Simulators {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int speed;

    public Racetrack() {
    }

    public Racetrack(String name, double price, int exerciseDuration,
                     String colour, String exercise,
                     MusclesGroup musclesGroup, int speed) {
        super(name, price, exerciseDuration, colour, exercise, musclesGroup);
        this.speed = speed;
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ", speed";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + getSpeed();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


