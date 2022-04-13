package com.nhnacademy.edu.springframework.project.repository;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface Scores {
    void load();

    List<Score> findAll();
}
