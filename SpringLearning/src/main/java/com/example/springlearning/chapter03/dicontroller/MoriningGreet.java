package com.example.springlearning.chapter03.dicontroller;

import org.springframework.stereotype.Component;

@Component
public class MoriningGreet implements Greet{

    @Override
    public void greeting() {
        System.out.println("좋은 아침");
    }
}
