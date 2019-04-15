package ua.lviv.iot.gym2.repository;

import ua.lviv.iot.gym2.models.Racetrack;

import javax.transaction.Transactional;

@Transactional
public interface RacetrackRepository extends SimulatorsRepository<Racetrack> {
}
