package com.example.springlearning;

import com.example.springlearning.chapter03.dicontroller.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearningApplication.class, args).getBean(SpringLearningApplication.class);//.execute();
    }


/*    @Autowired
    Greet greet;

    private void execute(){
        greet.greeting();
    }*/

}
