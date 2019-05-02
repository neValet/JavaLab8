package ua.lviv.iot.gym2.controllers;

import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.gym2.exceptions.RacetrackNotFoundException;
import ua.lviv.iot.gym2.models.Racetrack;
import ua.lviv.iot.gym2.repository.RacetrackRepository;


@RestController
public class SimulatorsController {
    RacetrackRepository racetrackRepository;

    public SimulatorsController(RacetrackRepository racetrackRepository) {
        this.racetrackRepository = racetrackRepository;
    }

    @GetMapping("/simulators/")
    public Iterable<Racetrack> all() {
        return racetrackRepository.findAll();
    }

    @GetMapping("/simulators/{id}")
    public Racetrack one(@PathVariable Integer id) {
        return racetrackRepository.findById(id)
                .orElseThrow(() -> new RacetrackNotFoundException(id));
    }

    @PostMapping("/simulators")
    public Racetrack newRacetrack(
            @RequestParam(defaultValue = "defaultName") String name,
            @RequestParam(defaultValue = "0") Double price,
            @RequestParam(defaultValue = "120") int exerciseDuration,
            @RequestParam(defaultValue = "defaultColour") String colour,
            @RequestParam(defaultValue = "defaultExercise") String exercise) {
        Racetrack newRacetrack = new Racetrack(name, price, exerciseDuration, colour, exercise);
        return racetrackRepository.save(newRacetrack);
    }

    @PutMapping("/simulators/{id}")
    public Racetrack replaceRacetrack(
            @RequestParam(defaultValue = "defaultName") String name,
            @RequestParam(defaultValue = "0") Double price,
            @RequestParam(defaultValue = "120") int exerciseDuration,
            @RequestParam(defaultValue = "defaultColour") String colour,
            @RequestParam(defaultValue = "defaultExercise") String exercise,
            @PathVariable Integer id) {
        Racetrack newRacetrack = new Racetrack(name, price, exerciseDuration, colour, exercise);
        return racetrackRepository.findById(id).map(
                racetrack -> {
                    racetrack.setName(newRacetrack.getName());
                    racetrack.setPrice(newRacetrack.getPrice());
                    racetrack.setExerciseDuration(newRacetrack.getExerciseDuration());
                    racetrack.setColour(newRacetrack.getColour());
                    racetrack.setColour(newRacetrack.getColour());

                    return racetrackRepository.save(racetrack);
                })
                .orElseThrow(() -> new RacetrackNotFoundException(id));
    }

    @DeleteMapping("/simulators/{id}")
    public void deleteRacetrack(@PathVariable Integer id) {
        racetrackRepository.deleteById(id);
    }
}
