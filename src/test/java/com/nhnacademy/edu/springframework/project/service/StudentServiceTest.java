//package com.nhnacademy.edu.springframework.project.service;
//
//import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
//import com.nhnacademy.edu.springframework.project.repository.Students;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentServiceTest {
//    Students students;
//    @BeforeEach
//    void setUp(){
//        students = CsvStudents.getInstance();
////        CsvDataLoadService csv = new CsvDataLoadService();
//        csv.loadAndMerge();
//    }
//    @Test
//    void getPassedStudents() {
//        Students studentRepository = CsvStudents.getInstance();
//        List<Student> passedStudent = studentRepository.findAll().stream().filter(student -> !student.getScore().isFail()).collect(
//            Collectors.toList());
//
//        assertThat(passedStudent.size()).isEqualTo(2);
//    }
//
//    @Test
//    void getStudentsOrderByScore() {
//        List<Student> studentListTmp = new ArrayList<>();
//        students.findAll().stream().forEach(student -> studentListTmp.add(student));
//        studentListTmp.remove(3);
//        List<Student> studentList = studentListTmp.stream().sorted().collect(Collectors.toList());
//
//        assertThat(studentList.size()).isEqualTo(3);
//    }
//}