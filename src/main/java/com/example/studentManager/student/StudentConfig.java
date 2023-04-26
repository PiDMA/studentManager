package com.example.studentManager.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args ->  {
            Student david = new Student(
                    "David",
                    "david.pinto@realmail.com",
                    LocalDate.of(1997, JANUARY, 5),
                    25
            );

            Student alex = new Student(
                    "Alex",
                    "alex@realmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    23
            );

            repository.saveAllAndFlush(
                    List.of(david, alex)
            );
        };
    }
}
