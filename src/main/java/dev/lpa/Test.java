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

//        OrbitEarth.log("Testing " + new Satellite());
//           Tue Jun 27 14:18:34 CEST 2023: Testing dev.lpa.Satellite@6e8cf4c6

        orbit(new Satellite());
//        Taking off
//        Transitioning from GROUNDED to LAUNCH
//        Tue Jun 27 14:43:05 CEST 2023: GROUNDED: Beginning transition to LAUNCH
//        Monitoring LAUNCH
//        Orbit achieved!
//        Transitioning from LAUNCH to CRUISE
//        Tue Jun 27 14:43:05 CEST 2023: LAUNCH: Beginning transition to CRUISE
//        Monitoring CRUISE
//        Data collection while orbiting
//        Transitioning from CRUISE to DATA_COLLECTION
//        Tue Jun 27 14:43:05 CEST 2023: CRUISE: Beginning transition to DATA_COLLECTION
//        Monitoring DATA_COLLECTION
//        Landing
//        Transitioning from DATA_COLLECTION to GROUNDED
//        Tue Jun 27 14:43:05 CEST 2023: DATA_COLLECTION: Beginning transition to GROUNDED
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

    private static void orbit(OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
