package dev.lpa;

public interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description) {       // implicitly public
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {

        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
       FlightStages nextStage = FlightEnabled.super.transition(stage);
       logStage(stage, "Beginning transition to " + nextStage);
       return nextStage;
    }
}
