package com.raehyun.zoo;

public class Dog extends Animal{

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void say() {
        System.out.println("멍멍");
    }

}
