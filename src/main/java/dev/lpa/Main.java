package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();  // Flaps wings
//        flier.move();
//        tracked.move();

        flier.takeOff();
//        Bird is taking off
        flier.fly();
//        Bird is flying
        tracked.track();
//        Bird's coordinates recorded
        flier.land();
//        Bird is landing

    }
}
