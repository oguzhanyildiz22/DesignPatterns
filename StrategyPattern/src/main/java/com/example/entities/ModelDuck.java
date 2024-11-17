package com.example.entities;

import com.example.entities.Quack.MuteQuack;
import com.example.entities.fly.FlyNoWay;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Model duck");
    }
}
