package com.nhnacademy.edu.springframework.project.aspect;

import com.nhnacademy.edu.springframework.project.repository.CsvScores;
import com.nhnacademy.edu.springframework.project.repository.CsvStudents;
import com.nhnacademy.edu.springframework.project.repository.Scores;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {
    @Around("execution( * findAll(..))")
public Object throwExceptionScores(ProceedingJoinPoint pjp) throws Throwable {
        if(!(CsvScores.isEndOfRead())){
            throw new IllegalStateException();
        }
        return pjp.proceed();
    }

    @Around("execution( * findAll(..))")
    public Object throwExceptionStudent(ProceedingJoinPoint pjp) throws Throwable {
        if(!(CsvStudents.isEndOfRead())){
            throw new IllegalStateException();
        }
        return pjp.proceed();
    }

    @Around("execution( * merge(..))")
    public Object throwExceptionStudentMerge(ProceedingJoinPoint pjp) throws Throwable {
        if(!(CsvStudents.isEndOfRead())){
            throw new IllegalStateException();
        }
        return pjp.proceed();
    }

}
