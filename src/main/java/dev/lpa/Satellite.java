package dev.lpa;

public class Satellite implements OrbitEarth {

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {
    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
    }
}
