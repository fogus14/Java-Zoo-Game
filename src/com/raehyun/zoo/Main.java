package com.raehyun.zoo;

public class Main {

    public static void main(String[] args) {
        Food dogFood = new Food("강아지 기본 사료", 100);
        Zookeeper zookeeper1 = new Zookeeper("사육사1");
        Animal dog1 = new Dog(10, "바둑이");
        Animal dog2 = new Dog(10, "바둑이");

        dog1.say();

        zookeeper1.addAnimal(dog1);
        zookeeper1.addAnimal(dog2);

    }

}
