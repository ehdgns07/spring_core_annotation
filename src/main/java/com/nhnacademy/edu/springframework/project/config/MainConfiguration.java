package com.nhnacademy.edu.springframework.project.config;

import com.nhnacademy.edu.springframework.project.repository.CsvScores;
import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
import com.nhnacademy.edu.springframework.project.repository.Scores;
import com.nhnacademy.edu.springframework.project.repository.Students;
import com.nhnacademy.edu.springframework.project.service.CsvDataLoadService;
import com.nhnacademy.edu.springframework.project.service.DataLoadService;

import com.nhnacademy.edu.springframework.project.service.Student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.project")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Component
public class MainConfiguration {

    @Qualifier("csvStudents")
    public Scores CsvScores() {
        return new CsvScores();
    }

    @Qualifier("csvScores")
    public Students CsvStudents() {
        return new CsvStudents();
    }


    public DataLoadService dataLoadService(@Qualifier("csvScores") Scores scores,
                                           @Qualifier("csvStudents") Students students) {
        return new CsvDataLoadService(scores, students);
    }
}
