package com.jxy;

import com.jxy.springMvc.beans.UserBean;
import com.jxy.springMvc.config.MyRootConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyRootConfig.class);
        UserBean bean=context.getBean(UserBean.class);
        bean.say();
    }
}
