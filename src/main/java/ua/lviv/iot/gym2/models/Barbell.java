package ua.lviv.iot.gym2.models;

import ua.lviv.iot.gym2.enums.BarbellTypes;

public class Barbell extends Simulators {

    private BarbellTypes barbellTypes;

    public Barbell() {
    }

    public Barbell(String name, double price, int exerciseDuration,
                   String colour, String exercise, BarbellTypes barbellTypes) {
        super(name, price, exerciseDuration, colour, exercise);
        this.barbellTypes = barbellTypes;
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ", BarbellTypes";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + getBarbellTypes();
    }

    public final BarbellTypes getBarbellTypes() {
        return barbellTypes;
    }

    public void setBarbellTypes(BarbellTypes barbellTypes) {
        this.barbellTypes = barbellTypes;
    }
}
