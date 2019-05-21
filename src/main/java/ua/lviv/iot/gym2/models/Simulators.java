package ua.lviv.iot.gym2.models;

import ua.lviv.iot.gym2.enums.MusclesGroup;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simulators {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private double price;
    private int exerciseDuration;
    private String colour;
    private String exercise;

    public Simulators() {
    }

    public Simulators(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Simulators(String name, double price, int exerciseDuration,
                      String colour, String exercise) {
        this.name = name;
        this.price = price;
        this.exerciseDuration = exerciseDuration;
        this.colour = colour;
        this.exercise = exercise;
    }


    public String getHeaders() {
        return "name, price, exerciseDuration, colour, exercise";
    }

    public String toCSV() {
        return getId() + ", " + getName() + ", " + getPrice() + ", " + getExerciseDuration() +
                ", " + getColour() + ", " +
                getExercise();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExerciseDuration() {
        return exerciseDuration;
    }

    public void setExerciseDuration(int exerciseDuration) {
        this.exerciseDuration = exerciseDuration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

}
