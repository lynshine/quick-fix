package com.github.liuyueyi.fix.spring;

import com.github.liuyueyi.fix.spring.loader.BeanServerLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by @author yihui in 17:17 18/12/29.
 */
@Configuration
public class FixerAutoConfig {

    @Bean
    public BeanServerLoader beanServerLoader(ApplicationContext applicationContext) {
        return new BeanServerLoader(applicationContext);
    }

}
