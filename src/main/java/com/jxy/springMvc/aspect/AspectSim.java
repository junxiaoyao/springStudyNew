package com.jxy.springMvc.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectSim {
    @Pointcut("execution(* com.jxy.springMvc.beans.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void sayBefore(){
        System.out.println(" ---------i am a before advice------------");
    }

    @After("pointCut()")
    public void after(){
        System.out.println(" ---------i am a after advice------------");
    }

}
