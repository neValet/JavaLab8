package ua.lviv.iot.gym2.exceptions;

public class RacetrackNotFoundException extends RuntimeException {

    public RacetrackNotFoundException(Integer id) {
        super("Could not find racetrack " + id);
    }
}