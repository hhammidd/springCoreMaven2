package com.spring.springCore.annotationAppContext.autowiredPrimQualifier.config;

import com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model.MobileProcessor;
import com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model.Samsung;
import com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model.Snapdragon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model")
public class AppConfig {

    // for cancelling @Bean from here just put @Component in each Bean class
}
