package com.nhnacademy.edu.springframework.project.service;

import com.nhnacademy.edu.springframework.project.repository.CsvScores;
import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
import com.nhnacademy.edu.springframework.project.repository.Scores;
import com.nhnacademy.edu.springframework.project.repository.Students;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CsvDataLoadService implements DataLoadService {
    private Scores scores;
    private Students students;

    @Autowired
    public CsvDataLoadService(Scores scores, Students students){
        this.scores = scores;
        this.students = students;
    }

    @Override
    public void loadAndMerge() {

        scores.load();


        students.load();
        students.merge(scores.findAll());
    }
}
