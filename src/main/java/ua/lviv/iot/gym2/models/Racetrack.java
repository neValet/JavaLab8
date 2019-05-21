package ua.lviv.iot.gym2.models;

import ua.lviv.iot.gym2.enums.MusclesGroup;

import javax.persistence.*;

@Entity
@Inheritance
public class Racetrack extends Simulators {
    public Racetrack() {
    }

    public Racetrack(String name, double price, int exerciseDuration,
                     String colour, String exercise) {
        super(name, price, exerciseDuration, colour, exercise);
    }

    @Override
    public String getHeaders() {

        return super.getHeaders();
    }

    @Override
    public String toCSV() {

        return super.toCSV();
    }
}


