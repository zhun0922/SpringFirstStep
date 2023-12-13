package com.example.springlearning.chapter03.DIController;

public class MoriningGreet implements Greet{

    @Override
    public void greeting() {
        System.out.println("좋은 아침");
    }
}
