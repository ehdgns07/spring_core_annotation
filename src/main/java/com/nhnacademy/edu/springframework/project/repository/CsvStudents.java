package com.nhnacademy.edu.springframework.project.repository;

import com.nhnacademy.edu.springframework.project.service.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/** TODO 3 : load 를 완료전에 기타 메소드 실행시 IllegalStateException 이 발생해야 한다.끝
 **/

/**
 * TODO 7 : singleton 클래스를 만드세요.끝
 */

@Component
@Repository
public class CsvStudents implements Students {
    private final Map<Integer,Student> students = new HashMap<>();
    private static boolean isEndOfRead;
//    private static CsvStudents csvStudents_instance = null;

//    private CsvStudents(){
//    }
//
//    public static Students getInstance() {
////        if(!isEndOfRead){
////            throw new IllegalStateException();
////        }
//
//        if(csvStudents_instance == null){
//            csvStudents_instance = new CsvStudents();
//        }
//
//        return csvStudents_instance;
//    }

    // TODO 6 : student.csv 파일에서 데이터를 읽어 멤버 변수에 추가하는 로직을 구현하세요.끝
    @Override
    public void load() {
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("./data/student.csv")))) {
            while ((line = reader.readLine()) != null) {
                String[] lineArr = line.split(",");
                students.put(Integer.parseInt(lineArr[0]),new Student(Integer.parseInt(lineArr[0]), lineArr[1]));
            }
            isEndOfRead = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Collection<Student> findAll() {
        if(!isEndOfRead){
            throw new IllegalStateException();
        }

        Collection<Student> values = students.values();
        List<Student> studentList = new ArrayList<>(values);

        return studentList;
    }

    /**
     * TODO 8 : students 데이터에 score 정보를 추가하세요.끝
     * @param scores
     */
    @Override
    public void merge(Collection<Score> scores) {
        if(!isEndOfRead){
            throw new IllegalStateException();
        }
        scores.stream().forEach(score -> students.get(score.getStudentSeq()).setScore(score));
    }

    public static boolean isEndOfRead() {
        return isEndOfRead;
    }

}