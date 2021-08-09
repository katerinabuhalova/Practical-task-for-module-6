package com.company;

public class Run extends Person {
    public int distance;
    public int numberTimesWeek;

    public Run(String name, int age, int distance, int numberTimesWeek) {
        super(name, age);
        this.distance = distance;
        this.numberTimesWeek = numberTimesWeek;
    }

    @Override
    public void numberKilometersWeek() {
        int sumKilometers = distance * numberTimesWeek;
        super.numberKilometersWeek();
        System.out.println("but most of all I love to run.. Every week i run " + sumKilometers + " kilometres.");

    }
}
