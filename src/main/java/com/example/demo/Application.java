package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student maria = new Student("Maria", "Jones", "maria.jones@gmail.com", 30
            );
            studentRepository.save(maria);
        };
    }

}
