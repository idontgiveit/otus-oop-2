package ru.otus.oop;

import ru.otus.oop.animals.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("snezhok", "white", 10);
        Animal dog = new Dog("sharick", "black");
        Animal horse = new Horse("rassvet", "brown");
        Animal wildCat = new WildCat("noname", "black");
        Animal myDog = new MyDog("king", "white");

        System.out.println(dog.toString());

        Dog dog1 = new Dog("1", "1");
        Dog dog2 = new Dog("1", "1");

        System.out.println(dog1.equals(dog2));


        Object a = 10;
        System.out.println(a instanceof Integer);

        Integer result = ((Integer) a) + 10;
        System.out.println(result);

        cat.voice();
        dog.voice();




    }


    public static void voice(Animal animal) {
        animal.voice();
    }

}
