package com.nhnacademy.edu.springframework.project.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//class ScoresTest {
//    Scores scores = CsvScores.getInstance();
//    List<Score> scoreList;
//    @BeforeEach
//    void setUp(){
//        scoreList = new ArrayList<>();
//
//        String line;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("./data/score.csv")))) {
//            while ((line = reader.readLine()) != null) {
//                String[] lineArr = line.split(",");
//                scoreList.add(new Score(Integer.parseInt(lineArr[0]),Integer.parseInt(lineArr[1])));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    void load() {
//
//        scores.load();
//
//        List <Integer> scoreA = new ArrayList<>();
//        List <Integer> scoreB = new ArrayList<>();
//        List <Integer> scoreC = new ArrayList<>();
//        List <Integer> scoreD = new ArrayList<>();
//
//        scores.findAll().stream().forEach(score -> scoreA.add(score.getScore()));
//        scoreList.stream().forEach(score -> scoreB.add(score.getScore()));
//        assertThat(scoreA.containsAll(scoreB)).isTrue();
//
//        scores.findAll().stream().forEach(score -> scoreC.add(score.getStudentSeq()));
//        scoreList.stream().forEach(score -> scoreD.add(score.getStudentSeq()));
//        assertThat(scoreC.containsAll(scoreD)).isTrue();
//    }
//
//    @Test
//    void findAll() {
//        scores.load();
//
//        assertThat(scores.findAll().size()).isEqualTo(3);
//    }
//}