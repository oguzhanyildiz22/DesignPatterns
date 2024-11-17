package com.example;

import com.example.entities.Duck;
import com.example.entities.fly.FlyRocketPowered;
import com.example.entities.MallardDuck;
import com.example.entities.ModelDuck;

public class Main {
    public static void main(String[] args) {

        System.out.println("*************************************");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("*************************************");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}