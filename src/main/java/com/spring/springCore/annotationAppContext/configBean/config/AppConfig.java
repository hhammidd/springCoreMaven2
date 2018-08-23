package com.spring.springCore.annotationAppContext.configBean.config;

import com.spring.springCore.annotationAppContext.configBean.model.MobileProcessor;
import com.spring.springCore.annotationAppContext.configBean.model.Samsung;
import com.spring.springCore.annotationAppContext.configBean.model.Snapdragon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    //
    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }
}
