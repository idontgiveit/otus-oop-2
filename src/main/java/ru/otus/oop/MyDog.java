package ru.otus.oop;

import ru.otus.oop.animals.Dog;

public class MyDog extends Dog {
    public MyDog(String name, String color) {
        super(name, color);
    }

    public void meet() {
        System.out.println(name + " радуется");
    }
}
