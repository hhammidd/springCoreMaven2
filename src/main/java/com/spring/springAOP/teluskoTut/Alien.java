package com.spring.springAOP.teluskoTut;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    public void show()
    {

       // these 1, 2, 3 is not Business Logic (Cross cutting) and you do not want to see it
        //1. log --> 2 lines
        //2. security --> only when you are logged on
        //3. transaction --> when you use DB ... transfer the money. Transaction begin

        // here finish transaction

        //15 statements -->Business Logic
        System.out.println("Hello World");

        // log --> 2 lines
    }
}
