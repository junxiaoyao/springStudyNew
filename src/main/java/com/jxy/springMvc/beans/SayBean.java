package com.jxy.springMvc.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value=WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
public class SayBean {
    public void say(){
        System.out.println("i am say ");
    }
}
