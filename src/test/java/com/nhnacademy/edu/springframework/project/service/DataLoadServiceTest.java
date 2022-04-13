package com.nhnacademy.edu.springframework.project.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.edu.springframework.project.repository.CsvScores;
import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
import com.nhnacademy.edu.springframework.project.repository.Score;
import com.nhnacademy.edu.springframework.project.repository.Scores;
import com.nhnacademy.edu.springframework.project.repository.Students;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//class DataLoadServiceTest {
//
//    List<Score> scoreList;
//    Map<Integer, Student> studentsMap;
//
//    @BeforeEach
//    void setUp() {
//
//        studentsMap = new HashMap<>();
//
//        String line;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
//            getClass().getClassLoader().getResourceAsStream("./data/student.csv")))) {
//            while ((line = reader.readLine()) != null) {
//                String[] lineArr = line.split(",");
//                studentsMap.put(Integer.parseInt(lineArr[0]),
//                    new Student(Integer.parseInt(lineArr[0]), lineArr[1]));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        scoreList = new ArrayList<>();
//
//        try (
//            BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                    getClass().getClassLoader().getResourceAsStream("./data/score.csv")))) {
//            while ((line = reader.readLine()) != null) {
//                String[] lineArr = line.split(",");
//                scoreList.add(
//                    new Score(Integer.parseInt(lineArr[0]), Integer.parseInt(lineArr[1])));
//            }
//        } catch (
//            IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    void loadAndMergeTest() {
//        Scores scores = CsvScores.getInstance();
//        scores.load();
//        List<Integer> scoreA = new ArrayList<>();
//        List<Integer> scoreB = new ArrayList<>();
//        List<Integer> scoreC = new ArrayList<>();
//        List<Integer> scoreD = new ArrayList<>();
//
//        scores.findAll().stream().forEach(score -> scoreA.add(score.getScore()));
//        scoreList.stream().forEach(score -> scoreB.add(score.getScore()));
//        assertThat(scoreA.containsAll(scoreB)).isTrue();
//
//        scores.findAll().stream().forEach(score -> scoreC.add(score.getStudentSeq()));
//        scoreList.stream().forEach(score -> scoreD.add(score.getStudentSeq()));
//        assertThat(scoreC.containsAll(scoreD)).isTrue();
//
//        Students students = CsvStudents.getInstance();
//        students.load();
//        List<Integer> seq = new ArrayList<>();
//        List<String> name = new ArrayList<>();
//        List<Integer> seq2 = new ArrayList<>();
//        List<String> name2 = new ArrayList<>();
//        studentsMap.values().stream().forEach(student -> seq.add(student.getSeq()));
//        students.findAll().stream().forEach(student -> seq2.add(student.getSeq()));
//        assertThat(seq.containsAll(seq2)).isTrue();
//
//        studentsMap.values().stream().forEach(student -> name.add(student.getName()));
//        students.findAll().stream().forEach(student -> name2.add(student.getName()));
//        assertThat(name.containsAll(name2)).isTrue();
//
//        students.merge(scores.findAll());
//
//        List<Score> scoreList = new ArrayList<>();
//
//        students.findAll().stream().forEach(student -> scoreList.add(student.getScore()));
//        assertThat(scoreList.containsAll(scores.findAll())).isTrue();
//    }
//}