package ru.otus.oop.animals;

public class Cat extends Animal {

    private int weight;

        public Cat(String name, String color, int weight) {
        super(name, color);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println(name + " Мяукнул");
    }
}
