package com.company;

public class Fish extends Animals {

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);

    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
