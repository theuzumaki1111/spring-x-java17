package com.example.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    /**
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return arg -> extracted(repository);
    }

    private void extracted(StudentRepository repository) {
        Student jack = new Student(
            "jack",
            "jack@springboot.com",
            LocalDate.of(1999, Month.JANUARY, 5)
        );
        Student john = new Student(
            "john",
            "john@springboot.com",
            LocalDate.of(1995, Month.FEBRUARY, 5)
        );
        repository.saveAll(
            List.of(jack, john)
        );
    }
    
}
