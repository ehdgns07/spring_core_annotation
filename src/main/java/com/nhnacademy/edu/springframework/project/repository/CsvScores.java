package com.nhnacademy.edu.springframework.project.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/** TODO 2 : load 를 완료전에 기타 메소드 실행시 IllegalStateException 이 발생해야 한다.끝
 **/

@Component
@Repository
public class CsvScores implements Scores {
    private static boolean isEndOfRead = false;

    private final List<Score> scores = new ArrayList<>();
//    private static CsvScores csvScores_instance = null;

//    private CsvScores(){}
//
//    public static Scores getInstance() {
//        if(csvScores_instance == null){
//            csvScores_instance = new CsvScores();
//        }
//        return csvScores_instance;
//    }

    // TODO 5 : score.csv 파일에서 데이터를 읽어 멤버 변수에 추가하는 로직을 구현하세요.끝
    @Override
    public void load() {
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("./data/score.csv")))) {
            while ((line = reader.readLine()) != null) {
                String[] lineArr = line.split(",");
                scores.add(new Score(Integer.parseInt(lineArr[0]),Integer.parseInt(lineArr[1])));
            }
            isEndOfRead = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Score> findAll() {

//        if(!isEndOfRead){
//            throw new IllegalStateException();
//        }
        return scores;
    }

    public static boolean isEndOfRead() {
        return isEndOfRead;
    }

}
