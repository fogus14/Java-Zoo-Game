package com.raehyun.zoo;

import java.util.Objects;

public class Animal {

    // attributes
    private int age;
    private String name;
    private int hp;


    // constructor

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        this.hp = 50;
    }

    // methods
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void eat(Food food) {
        if (this.hp + food.getHp() > 100) {
            System.out.println("배터져 죽어요 안 먹을래요!");
        } else {
            this.hp += food.getHp();
            System.out.println(this.name + "의 현재 hp는 " + this.hp + "입니다!");
        }
    }

    public void say() {
        System.out.println("동물이 말합니다.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
