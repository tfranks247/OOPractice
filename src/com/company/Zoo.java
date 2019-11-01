package com.company;

public class Zoo {

    public static void main(String [] args){

        Animals animal1 = new Animals(12, "male", 23);
        animal1.eat();

        Bird bird1 = new Bird(3, "female", 10);
        bird1.eat();
        bird1.sleep();
        bird1.fly();

        Fish fish1 = new Fish(2, "male", 7);
        fish1.swim();
        fish1.eat();
        fish1.sleep();

        Chicken chick1 = new Chicken(5, "female", 4);
        chick1.fly();
    }
}
