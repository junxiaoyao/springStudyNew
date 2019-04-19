package com.jxy.springMvc.beans;

import com.jxy.springMvc.annotation.Qu;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ss")
@Qu
public class QualifierBean {
    public void say(){
        System.out.println("i am a qualifierBean");
    }
}
