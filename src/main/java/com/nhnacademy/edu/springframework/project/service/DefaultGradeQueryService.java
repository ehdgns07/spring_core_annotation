package com.nhnacademy.edu.springframework.project.service;

import com.nhnacademy.edu.springframework.project.repository.CsvScores;
import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
import com.nhnacademy.edu.springframework.project.repository.Score;

import com.nhnacademy.edu.springframework.project.repository.Scores;
import com.nhnacademy.edu.springframework.project.repository.Students;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultGradeQueryService implements GradeQueryService {
    Scores scores;
    Students students;

    @Autowired
    public DefaultGradeQueryService(Scores scores, Students students){
        this.scores = scores;
        this.students = students;
    }

    @Override
    public List<Score> getScoreByStudentName(String name) {
        // TODO 5: 학생 이름으로 점수를 반환합니다. 동명이인 고려합니다.
        List<Score> sameNameStudent = new ArrayList<>();

        List<Student> studentA = students.findAll().stream()
            .filter(student->student.getName().equals(name)).collect(Collectors.toList());

        studentA.stream().forEach(student -> sameNameStudent.add(student.getScore()));

        return sameNameStudent;
    }

    @Override
    public Score getScoreByStudentSeq(int seq) {
        // TODO 6 : 학생 번호로 점수를 반환합니다.

        List<Score> getscore = scores.findAll().stream()
            .filter(score -> seq == score.getStudentSeq())
            .collect(Collectors.toList());

        return getscore.get(0);
    }
}
