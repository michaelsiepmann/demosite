package com.example.michael.demosite;

import com.example.michael.demosite.data.Person;
import com.example.michael.demosite.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemositeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemositeApplication.class, args);
    }

    private final PersonRepository personRepository;

    @Autowired
    public DemositeApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Bean
    public CommandLineRunner run() {
        return (args) -> {
            personRepository.save(new Person("Peter", "Miller"));

        };
    }
}
