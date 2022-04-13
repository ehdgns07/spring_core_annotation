//package com.nhnacademy.edu.springframework.project.service;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
//import com.nhnacademy.edu.springframework.project.repository.Score;
//import com.nhnacademy.edu.springframework.project.repository.Students;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.Csv;
//
//class DefaultGradeQueryServiceTest {
//    Students students;
//    @BeforeEach
//    void setup(){
//        students = CsvStudents.getInstance();
//        CsvDataLoadService csv = new CsvDataLoadService();
//        csv.loadAndMerge();
//    }
//
//    @Test
//    void getScoreByStudentName() {
//        String name="A";
//
//        List<Score> sameNameStudent = new ArrayList<>();
//
//        List<Student> studentA = students.findAll().stream()
//            .filter(student->student.getName().equals(name)).collect(Collectors.toList());
//
//        assertThat(studentA.size()).isEqualTo(2);
//
//        studentA.stream().forEach(student -> sameNameStudent.add(student.getScore()));
//        assertThat(sameNameStudent.size());
//
//
//    }
//}