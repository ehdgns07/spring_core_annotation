package com.nhnacademy.edu.springframework.project.repository;

import com.nhnacademy.edu.springframework.project.service.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//class StudentsTest {
//    Students students = CsvStudents.getInstance();
//    Scores scores = CsvScores.getInstance();
//    Map<Integer,Student> studentsMap;
//    @BeforeEach
//    void setUp(){
//        studentsMap = new HashMap<>();
//
//        String line;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("./data/student.csv")))) {
//            while ((line = reader.readLine()) != null) {
//                String[] lineArr = line.split(",");
//                studentsMap.put(Integer.parseInt(lineArr[0]),new Student(Integer.parseInt(lineArr[0]), lineArr[1]));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    void load() {
//
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
//
//    }
//
//    @Test
//    void findAll() {
//        assertThat(students.findAll().size()).isEqualTo(4);
//    }
//
//    @Test
//    void merge() {
//        students.load();
//        scores.load();
//        students.merge(scores.findAll());
//
//        List<Score> scoreList = new ArrayList<>();
//
//        students.findAll().stream().forEach(student -> scoreList.add(student.getScore()));
//        assertThat(scoreList.containsAll(scores.findAll())).isTrue();
//
//    }
//}