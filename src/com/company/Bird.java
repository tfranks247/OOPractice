package com.company;

public class Bird extends Animals{


    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly(){
        System.out.println("Flying...");
    }
}
