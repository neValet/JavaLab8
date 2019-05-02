package ua.lviv.iot.gym2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.gym2.models.Racetrack;
import ua.lviv.iot.gym2.repository.RacetrackRepository;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final RacetrackRepository racetrackRepository) {

        return (args) -> {
            racetrackRepository.save(new Racetrack("racetrack", 2000.00,
                    600, "white", "jogging"));

            racetrackRepository.findAll().forEach(System.out::println);
        };
    }
}
