package com.example.springlearning.chapter03.dicontroller;

import org.springframework.stereotype.Component;


public class EveningGreet implements Greet{

    @Override
    public void greeting() {
        System.out.println("좋은 저녁");
    }
}
