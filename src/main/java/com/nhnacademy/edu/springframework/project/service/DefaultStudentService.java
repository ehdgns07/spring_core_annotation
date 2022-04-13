package com.nhnacademy.edu.springframework.project.service;

import com.nhnacademy.edu.springframework.project.repository.Scores;
import com.nhnacademy.edu.springframework.project.repository.StudentService;
import com.nhnacademy.edu.springframework.project.repository.Students;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultStudentService implements StudentService {

    Students students;
    @Autowired
    public DefaultStudentService(Students students){
        this.students = students;
    }
    public Collection<Student> getPassedStudents() {

        // TODO 1 : pass한 학생만 반환하도록 수정하세요.


        return students.findAll().stream().filter(student -> !student.getScore().isFail()).collect(
            Collectors.toList());
    }

    @Override
    public Collection<Student> getStudentsOrderByScore() {

        // TODO 4 : 성적 순으로 학생 정보를 반환합니다.
        return students.findAll().stream().sorted().collect(Collectors.toList());
    }

}
