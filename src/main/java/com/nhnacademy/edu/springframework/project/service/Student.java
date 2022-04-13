package com.nhnacademy.edu.springframework.project.service;

import com.nhnacademy.edu.springframework.project.repository.Score;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final int seq;
    private final String name;
    private Score score;

    public String getName() {
        return name;
    }

    public Student(int seq, String name) {
        this.seq = seq;
        this.name = name;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "seq=" + seq +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}'+ '\n';
    }

    @Override
    public int compareTo(Student o) {
        if(o.getScore().getScore() == this.score.getScore()){
            return 0;
        }
        return o.getScore().getScore() < this.score.getScore() ? -1:1;
    }

}
