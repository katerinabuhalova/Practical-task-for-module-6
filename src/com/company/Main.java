package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Swimming("katy", 17, 7, 5, false);
        person.tellAboutYourself();

        Person person1 = new Run("Jo", 29, 15, 7);
        person1.tellAboutYourself();
    }
}