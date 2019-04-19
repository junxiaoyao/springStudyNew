package com.jxy;

import com.jxy.springMvc.beans.CryBean;
import com.jxy.springMvc.beans.UserBean;
import com.jxy.springMvc.config.MyRootConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyRootConfig.class);
        UserBean bean=context.getBean(UserBean.class);
        bean.say();
        CryBean cryBean=context.getBean(CryBean.class);
        cryBean.cry();
    }
    public static void test(){
//        String s1="sss";
//        String[] ss=(String[])s1;
    }
}
