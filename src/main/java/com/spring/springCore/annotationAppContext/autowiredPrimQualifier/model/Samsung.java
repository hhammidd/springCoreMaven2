package com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Here Samsung");
        cpu.process();
    }
}
