package com.example.springlearning.chapter03.dicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredClass {
    private Greet greet;

    @Autowired
    public AutowiredClass(Greet greet){
        this.greet = greet;
        execute();
    }

    public void execute(){
        greet.greeting();
    }
}
