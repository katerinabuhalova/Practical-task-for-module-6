package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void tellAboutYourself() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old");
        numberKilometersWeek();
    }

    public void numberKilometersWeek() {
        System.out.print("I like sport, ");
    }
}
