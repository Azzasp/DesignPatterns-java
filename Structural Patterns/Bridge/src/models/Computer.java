package models;

public abstract class Computer {

    private OperationalSystem os;
    private boolean isOn;

    public abstract void turnOn();
    public abstract void turnOff();

}
