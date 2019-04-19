package com.jxy.springMvc.aspect;

import com.jxy.springMvc.beans.InterBean;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InterAspect {
    @DeclareParents(value = "cryBean",defaultImpl = InterBeanImp.class)
    public static InterBean interBean;
}
