package com.raehyun.zoo;

public class Zookeeper {

    private String name;
    private Animal[] managedAnimals;
    private final int maxAnimalCount = 3;
    private int currentNumOfAnimals = 0;

    public Zookeeper(String name) {
        this.name = name;
        this.managedAnimals = new Animal[this.maxAnimalCount];
    }

    public boolean addAnimal(Animal animal) {
        if (this.currentNumOfAnimals + 1 > this.maxAnimalCount) {
            System.out.println("동물 수 꽉참");
            return false;
        }
        for (Animal managedAnimal : this.managedAnimals) {
            if (managedAnimal == animal) {
                System.out.println("중복된 동물입니다.");
                return false;
            }
        }
//        for(Animal a : this.managedAnimals){
//            if(a == animal){
//                System.out.println("중복된 동물입니다.");
//                return false;
//            }
//        }

        this.managedAnimals[this.currentNumOfAnimals] = animal;
        this.currentNumOfAnimals++;
        return true;

//        for (int i = 0; i < managedAnimals.length; i++) {
//            if (this.managedAnimals[i] == null) {
//                this.managedAnimals[i] = animal;
//                return true;
//            }
//        }
//
//        return false;

    }

}
