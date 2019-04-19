package com.jxy.springMvc.beans;

import com.jxy.springMvc.annotation.Qu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
    @Autowired
    private SayBean sayBean;
    @Autowired
    private SayBean sayBean2;
    @Autowired
    @Qualifier("ss")
    @Qu
    private QualifierBean qualifierBean;
    public void say(){
        System.out.println(sayBean==sayBean2);
        qualifierBean.say();
        sayBean.say();
        System.out.println("i say you are cool");
    }
}
