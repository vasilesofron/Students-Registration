package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student vasile = new Student(
                    "Vasile",
                    "vasilesofron01@gmail.com",
                    LocalDate.of(2001, Month.APRIL, 4));

            Student razvan = new Student(
                    "Razvan",
                    "razvan@gmail.com",
                    LocalDate.of(1999, Month.JUNE, 9));

            repository.saveAll(List.of(vasile, razvan));
        };
    }
}
