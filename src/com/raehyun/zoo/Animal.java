package com.raehyun.zoo;

public class Animal {

    // attributes
    private int age;
    private String name;
    private String type;
    private int hp;


    // constructor

    public Animal(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
        this.hp = 50;
    }

    // methods
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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


}
