package org.lessons.java;

public class Eagle extends Animal{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I am an animal that eats meat");
    }

    @Override
    public void call() {
        System.out.println("strid strid");
    }


}