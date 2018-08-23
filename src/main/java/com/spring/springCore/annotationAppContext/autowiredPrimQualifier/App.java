package com.spring.springCore.annotationAppContext.autowiredPrimQualifier;

import com.spring.springCore.annotationAppContext.autowiredPrimQualifier.config.AppConfig;
import com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model.Samsung;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
