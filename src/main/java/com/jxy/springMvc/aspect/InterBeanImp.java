package com.jxy.springMvc.aspect;

import com.jxy.springMvc.beans.InterBean;

public class InterBeanImp implements InterBean {
    @Override
    public void interBean() {
        System.out.println("i am e InterBeanImp bean");
    }
}
