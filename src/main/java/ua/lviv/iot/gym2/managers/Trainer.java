package ua.lviv.iot.gym2.managers;

import ua.lviv.iot.gym2.models.Simulators;

import java.util.List;

public interface Trainer {

    List<Simulators> sortByExerciseDuration(List<Simulators> simulators, boolean reverse);

    List<Simulators> sortByPrice(List<Simulators> simulators, boolean reverse);

}
