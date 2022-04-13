package com.nhnacademy.edu.springframework.project;

import com.nhnacademy.edu.springframework.project.config.MainConfiguration;
import com.nhnacademy.edu.springframework.project.service.CsvDataLoadService;
import com.nhnacademy.edu.springframework.project.service.DefaultGradeQueryService;
import com.nhnacademy.edu.springframework.project.service.DefaultStudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class SpringMain {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MainConfiguration.class)) {
//
            context.getBean("csvDataLoadService", CsvDataLoadService.class).loadAndMerge();

            context.getBean("defaultGradeQueryService", DefaultGradeQueryService.class).getScoreByStudentSeq(1);

            context.getBean("defaultGradeQueryService", DefaultGradeQueryService.class).getScoreByStudentName("a");

            context.getBean("defaultStudentService", DefaultStudentService.class).getPassedStudents();

            context.getBean("defaultStudentService", DefaultStudentService.class).getStudentsOrderByScore();
        }
    }
}
