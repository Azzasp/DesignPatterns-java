package models.computer;

import models.operationalsystem.OperationalSystem;

public abstract class Computer {

    private OperationalSystem os;
    private boolean isOn;

    public OperationalSystem getOs() {
        return os;
    }

    public void setOs(OperationalSystem os) {
        this.os = os;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public abstract void turnOn();
    public abstract void turnOff();

}
