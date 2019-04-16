package com.jxy.springMvc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
    @Autowired
    private SayBean sayBean;
    public void say(){
        sayBean.say();
        System.out.println("i say you are cool");
    }
}
