package com.raehyun.zoo;

public class Main {

    public static void main(String[] args) {
        Animal dog1 = new Animal(10, "멍멍이", "dog");
        System.out.printf("동물: 타입: %s 이름: %s 나이: %s\n", dog1.getType(), dog1.getName(), dog1.getAge());
        Food dogFood = new Food("강아지 기본 사료", 100);
        dog1.eat(dogFood);
        Zookeeper zookeeper1 = new Zookeeper("사육사1");
        System.out.println(zookeeper1.addAnimal(dog1));
        System.out.println(zookeeper1.addAnimal(dog1));
        System.out.println(zookeeper1.addAnimal(dog1));
        System.out.println(zookeeper1.addAnimal(dog1));

    }

}
