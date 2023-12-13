package com.example.springlearning.chapter03.DIController;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet{

    @Override
    public void greeting() {
        System.out.println("좋은 저녁");
    }
}
