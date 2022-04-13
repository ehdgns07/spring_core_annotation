//package com.nhnacademy.edu.springframework.project.aspect;
//
//import com.nhnacademy.edu.springframework.project.repository.CsvScores;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StopWatch;
//
//@Aspect
//@Component
//public class TimeStamp {
//
//    @Around("execution(public * loadAndMerge())")
//    public Object throwException(ProceedingJoinPoint pjp) throws Throwable {
//        StopWatch stopWatch = new StopWatch();
//        try {
//            stopWatch.start();
//            return pjp.proceed();
//        }finally{
//            stopWatch.stop();
//            System.out.println(stopWatch.prettyPrint());
//        }
//    }
//}
