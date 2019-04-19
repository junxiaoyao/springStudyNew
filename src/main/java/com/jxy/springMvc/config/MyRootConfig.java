package com.jxy.springMvc.config;

import com.jxy.springMvc.beans.CryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
//import org.springframework.context.annotation.ImportResource;

@Configuration
@ActiveProfiles({"cry"})
@ComponentScan({"com.jxy.springMvc.beans","com.jxy.springMvc.aspect"})
//@PropertySource("F:\\myWorkspace\\springStudyNew\\src\\main\\java\\com\\jxy\\springMvc\\config\\app.properties")
//@ImportResource 加载xml文件
@EnableAspectJAutoProxy
public class MyRootConfig {
    @Autowired
    Environment environment;
    @Value("#{T(System).currentTimeMillis()}")
    private long time;

    @Bean
    //@Conditional(CryCondition.class)
    @Profile("default")
    public CryBean cryBean() {
        String sr = environment.getProperty("spring.thymeleaf.cache");
        return new CryBean();
    }


}
