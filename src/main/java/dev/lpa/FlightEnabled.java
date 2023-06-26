package dev.lpa;

public interface FlightEnabled {

    double MILES_TO_KM = 1.609_34;

    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();
}
