package ru.otus.oop.animals;

public class Horse extends Animal{
    public Horse(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println(name + " ржет");
    }
}
