package ru.otus.oop.animals;

import ru.otus.oop.animals.Cat;

public class WildCat extends Cat {
    public WildCat(String name, String color) {
        super(name, color,1 );
    }

    public void catchMouse() {
        System.out.println("Mouse caught");
    }
}
