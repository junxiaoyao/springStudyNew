package com.jxy.springMvc.condition;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CryCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        ClassLoader classLoader=conditionContext.getClassLoader();
        BeanFactory beanFactory= conditionContext.getBeanFactory();
        return environment.containsProperty("systemProperties");
    }
}
