package ua.lviv.iot.gym2.repository;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.gym2.models.Simulators;

public interface SimulatorsRepository <T extends Simulators> extends CrudRepository<Simulators, Integer> {
}
