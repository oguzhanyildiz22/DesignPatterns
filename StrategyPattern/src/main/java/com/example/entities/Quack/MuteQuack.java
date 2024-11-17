package com.example.entities.Quack;

import com.example.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Don’t quack.");
    }
}
