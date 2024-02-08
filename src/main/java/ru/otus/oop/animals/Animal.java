package ru.otus.oop.animals;

public abstract class Animal {
    protected String name;
    protected String color;


    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "animal: " +  name + " " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        if (obj instanceof Animal && obj.getClass().equals(this.getClass())) {
            Animal test = (Animal) obj;
            return this.color.equals(test.color) && this.name.equals(test.name);
        }

        return false;
    }
}
