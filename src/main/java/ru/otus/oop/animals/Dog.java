package ru.otus.oop.animals;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public void voice() {
        System.out.println(name + " Лает");
    }
}
