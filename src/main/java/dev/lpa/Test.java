package dev.lpa;

public class Test {

    public static void main(String[] args) {

        inFlight(new Jet());
//        Jet is taking off
//        Jet transitioning
//        Transitioning from LAUNCH to CRUISE
//        Jet is flying
//        Jet's coordinates recorded
//        Jet is landing
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
