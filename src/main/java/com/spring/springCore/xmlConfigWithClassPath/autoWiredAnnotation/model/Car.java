package com.spring.springCore.xmlConfigWithClassPath.autoWiredAnnotation.model;

import com.spring.springCore.xmlConfigWithClassPath.beanProperty.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    // use Autowire to make dependancy of objects
    @Autowired
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        System.out.println("car " + tyre);
    }
}
