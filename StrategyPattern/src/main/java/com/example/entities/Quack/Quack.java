package com.example.entities.Quack;

import com.example.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack.");
    }
}
