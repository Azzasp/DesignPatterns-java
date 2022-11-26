package models.computer;

import models.exceptionhandle.OSNotFound;
import models.operationalsystem.OperationalSystem;
import models.programs.Program;

public class Laptop extends Computer{
    private String model;
    private String brand;
    private OperationalSystem os;

    public Laptop(String model, String brand, OperationalSystem os) {
        this.model = model;
        this.brand = brand;
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public OperationalSystem getOs() {
        return os;
    }

    @Override
    public void setOs(OperationalSystem os) {
        this.os = os;
    }

    @Override
    public void turnOn() {
        try{
            if(os == null) throw new OSNotFound();
            os.startUp();
        }catch(OSNotFound e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void turnOff() {
        os.shutdown();
    }

    @Override
    public boolean installProgram(Program program) {
       return program.verifyCompatibleSystem(this);
    }
}
