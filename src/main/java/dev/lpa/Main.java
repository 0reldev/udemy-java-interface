package dev.lpa;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();  // Flaps wings

        inFlight(flier);
//        Bird is taking off
//        Bird is flying
//        Bird's coordinates recorded
//        Bird is landing

        inFlight(new Jet());
//        Jet is taking off
//        Jet is flying
//        Jet's coordinates recorded
//        Jet is landing

        Trackable truck = new Truck();
        truck.track();
//        Truck's coordinates recorded

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
//        Bird is taking off
        flyFliers(fliers);
//        Bird is flying
        landFliers(fliers);
//        Bird is landing

        triggerFliers(betterFliers);
//        Bird is taking off
        flyFliers(betterFliers);
//        Bird is flying
        landFliers(betterFliers);
//        Bird is landing
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }
    private static void landFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }

}
