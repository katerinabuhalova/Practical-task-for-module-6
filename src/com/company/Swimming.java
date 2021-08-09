package com.company;

public class Swimming extends Person {
    public int distance;
    public int numberTimesWeek;
    public boolean poolWorkout;

    public Swimming(String name, int age, int distance, int numberTimesWeek, boolean poolWorkout) {
        super(name, age);
        this.distance = distance;
        this.numberTimesWeek = numberTimesWeek;
        this.poolWorkout = poolWorkout;
    }

    @Override
    public void numberKilometersWeek() {
        int sumKilometers = distance * numberTimesWeek;
        super.numberKilometersWeek();
        System.out.println("but most of all I love to swimming. Every week i swimming " + sumKilometers + " kilometres.");
        if (poolWorkout == true) {
            System.out.println("All week i workout is pool.");
        } else {
            System.out.println("All week i workout is river");
        }
    }
}
